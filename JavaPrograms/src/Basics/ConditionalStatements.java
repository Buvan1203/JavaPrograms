package Basics;

public class ConditionalStatements {

	public static void main(String args[])
	{
		// if else
		int number=14;
		if(number>0)
			System.out.println("Positive");
		else if(number<0)
			System.out.println("Negative");
		else
			System.out.println("Number is Zero");
			
		//if works with single boolean value
		if(true)//Similar if(1==1)
			System.out.println(1);//Output will be 1
		else
			System.out.println(2);
		
		//nested if else
		if(true)//Similar if(1==1)
		{
			if(false)
				System.out.println(1);
			else
				System.out.println(2);//Output will be 2
		}	                                      
		else
			System.out.println(3);
		
		//Switch case
		int num=5;
		switch(num)
		{
			case 5: System.out.println("yes");break;
			case 6: System.out.println("No");break;
			default: System.out.println("Not a number");break;
		} 
	
	}
}
