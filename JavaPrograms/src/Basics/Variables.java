package Basics;

public class Variables {

	public static void main(String args[])
	{
		int age = 25; //To store numbers
		System.out.println("Age is "+age);
		
		String Name ="Bhuvan"; //To store words/Sentence - DOUBLE QUOTES
		String letter ="A";
		System.out.println("Name and letter is "+Name+" "+letter);
		
		char initial ='M'; //To store Letters -SINGLE QUOTES
		System.out.println(initial);
		
		//Integer -2147483648 to 214483647
		int a, b;
		a=5;
		b=10;
		System.out.println(a+b); //Result is 15
		System.out.println("a+b"); //Result is a+b
		System.out.println(a+" "+b); //Result is 5 10 
		System.out.println("Sum of a and b is "+(a+b)); //Result is 15
		//byte -128 to 127
		byte bytes=124;
		System.out.println(bytes);
		//short -32768 to 32767
		short sh=3454;
		System.out.println(sh);
		//long
		long l=232445695L; //always add literal l or L at the end
		System.out.println(l);
		//float ->stores 7 decimal digits
		float Perc = 98.6356f; //always add literal f or F at the end
		System.out.println(Perc);
		//double ->stores 15 decimal digits
		double dbl=1235.6576547674;
		System.out.println(dbl);
		//boolean
		boolean bl=true; //No quotes
		System.out.println(bl);
	}
}
