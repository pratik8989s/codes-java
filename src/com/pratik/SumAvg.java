/*Create an array of integers by reading values from the 
user. Display the sum and average of the integers.
Also, display the number of values less than 
the average.*/


package com.pratik;

import java.util.Scanner;

public class SumAvg {
	
	public static void main(String[] args) {
		int sum=0;
		float avg;
		System.out.println("enter the number of units to be inserted");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		int emp1[]=new int[a];
		
		for (int i=0;i<a;i++)
		{
			emp1[i]=input.nextInt();
			
		}
		for (int i=0;i<a;i++)
		{
			sum=sum+emp1[i];
			
		}
		avg=sum/a;
	System.out.println("sum is: "+sum);
	System.out.println("avg is: "+avg);
	}
	
	

}
