package com.example.restdemoexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemoexample.entity.BookResponse;
import com.example.restdemoexample.entity.Books;
import com.example.restdemoexample.exception.BookNotFoundException;
import com.example.restdemoexample.repo.BookRepository;

import jakarta.validation.Valid;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
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
	
	
}
