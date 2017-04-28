/*A set of 5 words is given. Write a program to reverse each 
word and arrange the resulting words in alphabetical order.*/

package com.pratik;

import java.util.Arrays;

public class day1sum5 {

	public static void main(String[] args) {
		
		String arr1[]={"hello","my","name","is","khan"};
		String arr2[]=new String[5];
	//	String temp;
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr1[i]);
		String reverse = new StringBuffer(arr1[i]).reverse().toString();
	//	System.out.println(reverse);
		arr2[i]=reverse;
		
		
		
		}
	/*	System.out.println("new order is:");
	
		for(int j=0;j<=4;j++)
		System.out.println(arr2[j]);
		*/
		
		Arrays.sort(arr2);
		System.out.println("new order is:");
		for(int j=0;j<=4;j++)
		System.out.println(arr2[j]);
		
		
		
	}

}
