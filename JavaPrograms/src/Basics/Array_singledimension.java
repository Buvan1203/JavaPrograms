package Basics;

import java.util.Arrays;

public class Array_singledimension {
	
	public static void main(String[] args)
	{
		//declaration
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		//To find the length of an array
		System.out.println("lengthof an array: "+a.length);
		
		int []b= {1,2,3,4,5};	
		System.out.println("Value at index: "+b[1]);//to print the value
		
		String c[]= {"hello"," hi"};
		
		System.out.println("Printing all the values in an array: ");
		//to print all the values in an array
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Printing all the values in an array using enhanced loop: ");
		//to print all the values in an array
		for (int j:a)
		{
			System.out.println(j);
		}
		
		System.out.println("Simplest wat to print all the elements in an array using enhanced loop: ");
		System.out.println(Arrays.toString(a));
	}

}
