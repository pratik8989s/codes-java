package com.pratik;

public class Demo1  extends Demo {
	
	int c;

	public Demo1(int a, String b, int c) {
		super(a, b);
		this.c = c;
	}

public Demo1() {
	// TODO Auto-generated constructor stub
}

public int getC() {
	return c;
}

public void setC(int c) {
	this.c = c;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"Demo1 [c=" + c + "]";
}


	

	
	

	
}
