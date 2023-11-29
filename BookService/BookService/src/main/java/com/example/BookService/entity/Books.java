package com.example.BookService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="booksdata")
public class Books {
	@Id
	  @GeneratedValue
	  private int bookid;
	  @Column
	  @NotBlank(message = "book name can not be empty")
	  private String bookname;
	  @Column
	  @NotBlank(message = "author is required")
	  @Size(min=5,message = "name must be 5 letters long")
	  private String authorname;
	  @NotBlank(message = "mobile no is required")
	  @Pattern(regexp = "(^$|[0-9]{10})",message = "mobile no must be 10 digit long ")
	  private String mobileno;

	  public Books()
	  {
		  
	  }
	  
	  public Books(int bookid, @NotBlank(message = "book name can not be empty") String bookname,
			@NotBlank(message = "author is required") @Size(min = 5, message = "name must be 5 letters long") String authorname,
			@NotBlank(message = "mobile no is required") @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile no must be 10 digit long ") String mobileno) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.mobileno = mobileno;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	  
	 // @NotNull check if a given field is not null but allow empty values
	 //  and zero elements inside collection
	  
	 //  @NotEmpty check if a given field is not null and size is greater
	 //  than zero
	  
	 // @NotBlank check if the given field is not null and trimmed length 
	 // is greater than zero
	  
}
