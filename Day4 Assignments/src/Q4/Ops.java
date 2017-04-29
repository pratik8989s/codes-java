package Q4;

import java.math.*;
public class Ops implements MathOperation {

	float c;

	
	
	
	
	@Override
	public void add(float a, float b) {
		c=Math.max(a, b)+Math.min(a, b);
		System.out.println("Addition is : "+c);
	}

	@Override
	public void sub(float a, float b) {
		c=Math.max(a, b)-Math.min(a, b);
		System.out.println("Subtraction is : "+c);
	}

	@Override
	public void mult(float a, float b) {
		c=Math.max(a, b)*Math.min(a, b);
		System.out.println("Multiplication is : "+c);
		
	}

	@Override
	public void div(float a, float b) {
		c=Math.max(a, b)/Math.min(a, b);
		System.out.println("Division is : "+c);
		
	}

}
