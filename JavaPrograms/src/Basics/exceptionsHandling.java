package Basics;

import java.io.FileNotFoundException;

public class exceptionsHandling {

	public static void main(String[] args) throws FileNotFoundException{//checked exception
		// TODO Auto-generated method stub

		int arr[]= {3,5,2,4,6,8};
		//unchedkedexception
		try {
		System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size issue");
			System.out.println(e.getMessage()); // to print the message
		}
		
		try { //one try block can have multiple catch block
			System.out.println(arr[3]);//no issue, catch block wont execute
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array size issue");
				System.out.println(e.getMessage());
			}
			catch(ArithmeticException e)
			{
				System.out.println("Array size issue");
			}
		
		try { //if we dont know the name of the exception, we ce'use Exception
			System.out.println(arr[9]);//no issue, catch block wont execute
			}
			catch(Exception e)
			{
				System.out.println("Array size issue");
				System.out.println(e.getMessage());
			}
			
		
		try { //if we dont know the name of the exception, we ce'use Exception
			System.out.println(arr[9]);//no issue, catch block wont execute
			}
			catch(Exception e)
			{
				System.out.println("Array size issue");
				System.out.println(e.getMessage());
			}
		finally
		{
			System.out.println("am frrom finally block always execute with or without exception");
		}
	}

}

/*EXCEPTIONS: All exceptions are predefined class in java
Exception is an event which will cause termination of program due to invalid input from the user, so we must handle that in our code
Types of exceptions:
•	Checked exception – identified by java compiler (e.g.: interuptedexception, FileNotFoundException,IOException)
•	Unchecked exception – we have to handle this (eg:Arithmetic Exception, NullPointerException, ArrayIndexOutofBoundsExcpetion )
Unchecked-  That’s why we use try and catch block- whatever the exception it will throw, you have to mention that exception name in catch block
If we don’t know the name of the exception, we can have multiple catch blocks, we have many catch blocks for one try block
Or we could use Exception e, that will handle the exception
•	Try – statement that needs to be run
•	Catch – to handle the exception we must mention it and we could get message
•	Finally- finally block will always execute with or without exception


CHECKED – WE CAN USE TRY AND CATCH or throw
 Or We can also handle CHECKED exception in method level also using throw keyword
*/
