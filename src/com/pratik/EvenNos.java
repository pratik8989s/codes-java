/*Write a program to list all even numbers less 
than or equal to the number n.  The value of n is 
given through command
line as input to the program*/

package com.pratik;

import java.util.Scanner;



public class EvenNos {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		
		for (int i=0;i<=a;i++)
		{
			if (i % 2 == 0)
				System.out.println(i);
			
		}
		
		
		
	}

}
