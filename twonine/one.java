package twonine;



public class one {

	private int a;
	private String b;
	private float c;
	
	
	
	
	public one(int a, String b, float c) {
	try {
		if (a>30) {
			
		
			this.a = a;
			this.b = b;
			this.c = c;
						}
		
		else {
			throw new LessThanException("Invalid Input");
		}
	}
	
	
	catch (LessThanException e) {
		e.printStackTrace();
	} 
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
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}

	
	
	public one() {
		super();
		// TODO Auto-generated constructor stub
		//System.out.println("I'm inside a non-parameterized constructor and called like a function");
	}




	@Override
	public String toString() {
		this.a=this.a*2;
		return "one [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
	
	
	
	
}
