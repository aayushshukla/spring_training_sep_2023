package com.example.LibraryApp.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.LibraryApp.entity.BookResponse;
import com.example.LibraryApp.entity.Books;

// Annotation for interfaces declaring that a REST client with that interface should becreated (e.g. for autowiring into another component). 
//If SC LoadBalancer is availableit will be used to load balance the backend req
// give url of the api that u want to consume
// step3
@FeignClient(name="books",url="http://localhost:8081/")
public interface LibraryProxy {
	// method declarion  should be same 
  @GetMapping("/allbooksinfo")  // give the same request as original api
   List<Books> getAllBooksDetails();
  
  @PostMapping("/addbook")
  public ResponseEntity<BookResponse> addBook( @RequestBody Books book);
}
