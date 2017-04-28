/*Write a program that accepts a number in the range 1 to 50 
from the Command Line. It then compares the number against 
a single dimension array of five integer elements ranging in
value from 1 to 50. The program displays the message BINGO 
once the given input is found in the array. */
package com.pratik;

public class day1sum4 {

	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
	//	int arr1[]=new int[6];
		int arr1[]={10,20,30,40,50};
		
		for(int i=0;i<=4;i++){
		if (arr1[i]==n1)
		System.out.println("BINGO The number is at position "+i);
		
		else
			System.out.println("not found at this position "+i);
	
		}
	
		
		
	
	}
	
}
