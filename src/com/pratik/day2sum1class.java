package com.pratik;

public class day2sum1class {
	
	
	private int bookno;
	private String title;
	private String author;
	private float price;
	private static int bookCount; 

	static{
		bookCount=1;
	}
	
	
	



	public static int getBookCount() {
		return bookCount;
	}

	

	public day2sum1class(int bookno, String title, String author, float price) {
		
		this.bookno = bookno;
		this.title = title;
		this.author = author;
		this.price = price;
		bookCount++;
	}
	
	public static void setBookCount(int bookCount) {
		day2sum1class.bookCount = bookCount;
	}
	
	

	@Override
	public String toString() {
		return "day2sum1class [bookno=" + bookno + ", title=" + title
				+ ", author=" + author + ", price=" + price + "]";
	}

	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	


	
		
	}
	
	
	
	
	
	