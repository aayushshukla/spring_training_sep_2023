package com.example.restdemoexample.exception;

public class BookNotFoundException extends RuntimeException {
	
	 public BookNotFoundException(int id) {
		super("Could not found book with given "+id);
	}

}
