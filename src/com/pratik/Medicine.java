package com.pratik;

public abstract class Medicine {

	private int price;
	private int expDate;
	
	
	abstract void displayLabel();
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getExpDate() {
		return expDate;
	}
	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}
	
	
	
}
