package Basics;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number1= sc.nextInt();
		System.out.println("Number is: "+number1);
		
		System.out.println("Enter a Number: ");
		double number2= sc.nextDouble();
		System.out.println("Number is: "+number2);
		
		System.out.println("Enter a Name: ");
		String Name= sc.next();
		System.out.println("Name is: "+Name);
;	}

}
