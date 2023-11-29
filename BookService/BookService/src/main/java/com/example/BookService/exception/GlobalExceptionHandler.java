package com.example.BookService.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.BookService.entity.BookResponse;
//Types that carry this annotation are treated as 
//controller advice where @ExceptionHandler methods assume 
@RestControllerAdvice(annotations = RestController.class)
//@Order(1) Order defines the sort order for an annotated component
public class GlobalExceptionHandler extends  ResponseEntityExceptionHandler{
  //Annotation for handling exceptions in specific handler 
	//classes and/orhandler methods. 
	// this method handles if request data format is incorrect 
	@Override
		protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
				HttpHeaders headers, HttpStatusCode status, WebRequest request) {
			// TODO Auto-generated method stub
		 BookResponse bookResponse = new BookResponse(status.toString(),ex.getBindingResult().toString());
		// BookResponse bookResponse = new BookResponse(status.toString(),ex.getMessage());
		return new ResponseEntity(bookResponse,HttpStatus.BAD_REQUEST);
		}
	// @ExceptionHandler({BookNotFoundException.class,Ex2.class,Ex3.class})
	
	@ExceptionHandler({BookNotFoundException.class})
   public ResponseEntity<BookResponse> exceptionHandler(BookNotFoundException exception)
   {
	   BookResponse response = new BookResponse("500",exception.getMessage());
	   return new ResponseEntity(response,HttpStatus.INTERNAL_SERVER_ERROR);
   }
}
