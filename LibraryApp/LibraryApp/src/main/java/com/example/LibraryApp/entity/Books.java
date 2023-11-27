package com.example.LibraryApp.entity;



public class Books {
	
	  private int bookid;
	
	  private String bookname;
	
	  private String authorname;
	 
	  private String mobileno;
	  public Books()
	  {
		  
	  }
	  
	
	public Books(int bookid, String bookname, String authorname, String mobileno) {
		super();
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
