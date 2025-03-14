package Basics;

public class Methodclass2 {
	
	public static void main(String[] args)
	
	{
		/*Key notes to remember:
•	We can create objects only in the main, can’t create any other method
•	We can’t create methods inside the method (even inside the main method; we can’t create another method) 
•	Constructor can’t return any values and constructor name should be same as class name, we use constructor only for initialization, automatically called when object is created.
•	 Inside a constructor, you can initialize instance variables, print messages, call other methods, handle exceptions, and invoke other constructors (constructor chaining). The primary goal of the constructor is to set up the object, but it can also carry out some additional logic or interactions
Methods – Block or grp of statements which will perform certain task, call the method through object
 Whenever we define method, we must mention that return type (int, String) or no return type(void)
•	No parameter with no return type
•	No parameter with return type
•	Parameter with no return type
•	Parameter with return type
Constructor types:
•	Default constructor
•	Parameterized constructor (with parameters)
*/
		//type -1 method
		Methodclass1 obj1= new Methodclass1();//Creating object for another class
		
		obj1.display();//method with no return type and parameters
		
		obj1.display1("boo");//method with no return type with parameters
		
		int age=24;
		String detail=obj1.agedetail(age);//method with return type with parameters
		System.out.println(detail);
		
		String s=obj1.detail();//method with return type with no parameters
		System.out.println(s);
		
		/*---------------------------------------------------------------------------*/
		
		//Type-1 using object reference to store the value in local variable
		obj1.sno=3;
		obj1.print();//to print the local variable
		
		//Type-2  using method to store the value in local variable
		obj1.methodwithvalues(101,"Boo",24);//Passing the values to store in local variables
		obj1.printmethodwithvalues();//To print the local variables
		
		//Type-3 using constructor
		Methodclass1 consobj= new Methodclass1();  //Constructor overloading
		Methodclass1 consobj1= new Methodclass1(2,"hoo");
	}

}
