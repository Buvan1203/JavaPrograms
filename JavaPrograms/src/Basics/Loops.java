package Basics;

public class Loops {
	
	public static void main(String args[])
	{
		//While loop:will print even numbers till 10
		int i=1;
		System.out.println("While loop");
		while(i>=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
		//do while loop ->Will execute atleast once
		int j=1;
		System.out.println("Do-While loop");
		do
		{
			System.out.println(j);
			j++;
		}while(j>=10);    
		
		//for loop
		System.out.println("for loop");
		for(int k=0;k<=10;k++)
		{
			if(k%2==0)
			System.out.println(k);
		}
		
		//Break
		System.out.println("Break");
		for(int L=0;L<=10;L++)
		{
			if(L==3)
			{
				break;
			}
			System.out.println(L);
		}
		
		//Continue
		System.out.println("Continue");
		for(int L=0;L<=10;L++)
		{
			if(L==3||L==5)//on 3 AND 5, it won't print num 3AND 5, it will increment to next number and print till the condition fails
			{
				continue;
			}
			System.out.println(L);
		}
		
	}

}
