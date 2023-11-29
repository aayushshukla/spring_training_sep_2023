package com.example.BookService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookService.entity.BookResponse;
import com.example.BookService.entity.Books;
import com.example.BookService.exception.BookNotFoundException;
import com.example.BookService.repo.BookRepository;

import jakarta.validation.Valid;

@RestController

public class BookController {

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	org.springframework.core.env.Environment env;
	
	@GetMapping("/home")
	public BookResponse welcomeMsg()
	{
		BookResponse  response = new BookResponse();
		response.setStatusCode("200");
		response.setStatusMsg("Welcome to book api");
		return response;
	}
	
	@PostMapping("/addbook")
	public ResponseEntity<BookResponse> addBook(@Valid @RequestBody Books book)
	{
		bookRepository.save(book);
		BookResponse  response = new BookResponse();
		response.setStatusCode("200");
		response.setStatusMsg("Book Information Added successfully");
		return ResponseEntity.status(HttpStatus.CREATED)
				.header("thisiscreatedby","robo")
				.body(response);
	}
	
	@GetMapping("/getbook")
	public Books getBookById(@RequestParam int bookid)
	{
		return bookRepository.findById(bookid).
				orElseThrow(()-> new BookNotFoundException(bookid));
	}
	
	@DeleteMapping("/deletebook")
	//@RequestBody
	//RequestEntity<T>
	//@RequestParam
	public ResponseEntity<BookResponse> deleteBook(RequestEntity<Books> requestEntity)
	{
		// get request data
		org.springframework.http.HttpHeaders headers = requestEntity.getHeaders();
	    headers.forEach((key,value)->{
	    	System.err.println(String.format("Header '%s' = %s", 
	    			key,value.stream().collect(Collectors.joining("|"))));
	    });
		Books book =	requestEntity.getBody();
	    
	    bookRepository.deleteById(book.getBookid());
	    BookResponse response = new BookResponse();
	    response.setStatusCode("200");
	    response.setStatusMsg("Book is deleted");
	    return ResponseEntity.status(HttpStatus.OK).body(response);
	    
	}
	@PatchMapping("/updatebookinfo")
	public ResponseEntity<BookResponse>updateBook(@RequestBody Books book)
	{
		BookResponse bookResponse = new BookResponse();
		Optional<Books>  bookinfo =	bookRepository.findById(book.getBookid());
		if(bookinfo.isPresent())
		{
			bookinfo.get().setBookname(book.getBookname());
			bookinfo.get().setAuthorname(book.getAuthorname());
			bookRepository.save(bookinfo.get());
		}
		else {
			bookResponse.setStatusCode("400");
			bookResponse.setStatusMsg("Given Book Not Found");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(bookResponse);
		}
		bookResponse.setStatusCode("200");
		bookResponse.setStatusMsg("Given Book Information Is Updated");
		return ResponseEntity.status(HttpStatus.OK)
				.body(bookResponse);
	}
	@GetMapping("/allbooksinfo")
	public List<Books> getAllBooksDetails()
	{
		System.err.println(env.getProperty("local.server.port"));
		List<Books> bookList = new ArrayList<Books>();
		bookRepository.findAll().forEach(book->bookList.add(book));
		return bookList;
	}
	
}
