package com.shape;

public class Rectangle implements Polygon {

	private float length;
	private float breadth;
	float area;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void calcArea() {
		
		System.out.println("Area of rectangle is "+length*breadth);
	}


	@Override
	public void calcPeri() {
		
		System.out.println("Perimeter of Rectangle is "+2*(length+breadth));
		
	}
	
	
	
	
	
	
	
}
