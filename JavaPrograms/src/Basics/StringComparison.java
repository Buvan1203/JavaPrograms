package Basics;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true- compare the values only
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s3==s4);//false - will compare the objects since s3 s4 have 2 different objects
		System.out.println(s3.equals(s4));//true
		
		String s5="Hello";
		String s6=new String("Hello");
		System.out.println(s5==s6);//false - will compare the objects since s3 s4 have 2 different objects
		System.out.println(s5.equals(s6));//true
		
		String s7=s6;
		System.out.println(s6==s7);//true 
		System.out.println(s6.equals(s7));//true
	}

}
