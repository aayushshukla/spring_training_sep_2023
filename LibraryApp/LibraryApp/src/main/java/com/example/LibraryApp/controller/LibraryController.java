package com.example.LibraryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.LibraryApp.entity.BookResponse;
import com.example.LibraryApp.entity.Books;
import com.example.LibraryApp.proxy.LibraryProxy;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryProxy libraryProxy;
	
	@Autowired
	RestTemplate restTemplate;
   
	@GetMapping("/getbooklist")
   public List<Books> getBookList()
   {
	   return libraryProxy.getAllBooksDetails();
   }
	
   @PostMapping("/addnewbook")
   public ResponseEntity<BookResponse> addNewBook( @RequestBody Books book)
   {
	   return libraryProxy.addBook(book);
   }
   @GetMapping("/getbookdetail")
   public Books getBookById(@RequestParam int bookid)
   {
	   // import org.springframework.web.client.RestTemplate;
	   // creating rest template object
	  // RestTemplate restTemplate = new RestTemplate();
	   String uri ="http://localhost:8081/getbook";
	   // getForObject() Retrieve a representation by doing a GET on the URL.
	   //The response (if any) is converted and returned.
	   Books book = restTemplate.getForObject(uri+"?bookid="+bookid,Books.class);
	   
	   return book;
   }
   @PostMapping("/addcoursenewbook")
   public ResponseEntity<BookResponse> addCourseNewBook( @RequestBody Books book)
   {
	  // RestTemplate restTemplate = new RestTemplate();
	   String uri ="http://localhost:8081/addbook";
	  // Represents an HTTP request or response entity, consisting of headers and body
	   HttpEntity<Books> httpEntity = new HttpEntity<Books>(book);
	  ResponseEntity<BookResponse> responseEntity =
			  //  (uri , method ,httpentityobject , response class)
 	   restTemplate.exchange(uri,HttpMethod.POST, httpEntity,BookResponse.class);
	  return responseEntity;
	   
   }
}
