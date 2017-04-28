package com.pratik;

public class EnggBook extends day2sum1class {

	
	private String category;

	
	
	
	
	
	
		public EnggBook(int bookno, String title, String author, float price,
			String category) {
		super(bookno, title, author, price);
		this.category = category;
	}
		public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
