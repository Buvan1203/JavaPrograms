package Basics;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Length() method
		String s="Hello";
		System.out.println(s.length());//To print length
		System.out.println("Hi".length());
		
		//concat() method - to join strings
		String s1="Hi";
		String s2="welcome";
		System.out.println(s+s1);//To combine
		System.out.println(s.concat(s1));
		System.out.println(s.concat(s1).concat(s2));
		
		//trim() - remove spaces before and after the string
		s="  we lcome   ";
		System.out.println(s.trim());
		
		//charAt()- return character at the given index
		s="hello";
		System.out.println(s.charAt(4));
		
		//contains()-return true or false 
		System.out.println(s.contains("ell"));//true
		System.out.println(s.contains("sell"));//false
		System.out.println(s.contains("Hello"));//false- case sensitive
		
		//equals()
		s1="welcome";
		s2="welcome";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals("welcome"));//true
		System.out.println(s1.equals("Welcome"));//false
		//equalsIqnoreCases()
		System.out.println(s1.equalsIgnoreCase("Welcome"));//true
		
		//REPLACE()
		System.out.println(s1.replace('e', 's'));//replace character in a word
		s1="welcome, how are you?";
		System.out.println(s1);
		System.out.println(s1.replace("welcome", "hi"));//replace word in a sentence
		
		s1="WeLcoMe";
		//Substring()
		System.out.println(s1.substring(0,3));//will print index 0 to 2->wel
		//to uppercase(), to lowercase()
		System.out.println(s1.toUpperCase());//WELCOME
		System.out.println(s1.toLowerCase());//welcome
		
		//split()==split the string into multiple parts based on the given delimeter
		s1="WeL coMe";
		String a[]=s1.split(" ");
		System.out.println(Arrays.toString(a));
		String b[]=s1.split("L");
		System.out.println(Arrays.toString(b));
		String c[]=s1.split("M");
		System.out.println(Arrays.toString(c));
		
	}

}
