package com.test;
import com.shape.*;

public class DriverMain {

	public static void main(String[] args) {
	
		Rectangle rect = new Rectangle(15, 20);
		rect.calcArea();
		rect.calcPeri();
	
		
		
		Square sq = new Square(5);
		sq.calcArea();
		sq.calcPeri();
		
	

	}

}
