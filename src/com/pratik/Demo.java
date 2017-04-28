package com.pratik;

public class Demo {
	int a;
	String b;
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public Demo(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + "]";
	}
	
	
	
	
	
	
	
	
}
