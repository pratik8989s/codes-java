package com.shape;

public class Square implements Polygon {

	private float side;
	
	
	
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		System.out.println("area of square "+side*side);
		
	}

	@Override
	public void calcPeri() {
		System.out.println("perimeter of square is  "+4*side);
	}
	
	
	
}
