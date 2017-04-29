package Q4;

import java.util.Scanner;

public class OpeImp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number : ");
		float num1=in.nextFloat();
		System.out.print("Enter second number : ");
		float num2=in.nextFloat();
		
		Ops obj=new Ops();
		obj.add(num1, num2);
		obj.sub(num1, num2);
		obj.mult(num1, num2);
		obj.div(num1, num2);

	}

}
