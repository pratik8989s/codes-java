/*Write a program that accepts two numbers and a operator
like (+,-,*, /) as command line arguments and perform the 
appropriate operation indicated by the operator*/
package com.pratik;

public class day1sum3 {

	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		char c = args[2].charAt(0);
		int ans;
		
		
		
		//int i;
		if (c == '/')
		  ans=n1/n2;
		
		
		else if (c == '+')
			 ans=n1+n2;
		
		else if (c == '-')
			ans=n1-n2;
		
		else
			 ans=n1*n2;
		
		
	
		System.out.println("ans is: "+ans);
		
		

	}

}
