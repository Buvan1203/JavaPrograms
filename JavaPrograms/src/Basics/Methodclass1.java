package Basics;

public class Methodclass1 {//refer methodclass 2 also

	//Type-1 no return and parameters
	void display()
	{
		System.out.println("Hi, am no return type and no parameter method");
	}
	
	//Type-2 no return type with parameter
	void display1(String name)
	{
		System.out.println("My name is "+name+" and am inside no return type with parameter method");
	}
	
	//Type-3 return type with parameter
	String agedetail(int age)
	{
		return "My age is "+age+" and am inside return type with parameter";
	}
	
	//Type-4 return type with no parameter
	String detail()
	{
		return "Hi, am inside return type with no parameter";
	}
	
	/*-------------------------------------------------------------------------*/
	//Type-1
	int sno;//Local variable
	void print()
	{
	System.out.println("Obj reference: "+sno);
	}
	
	//Type-2
	int rollno;//Local variables
	String stuname;
	int stuage;
		
	void methodwithvalues(int num, String name, int age)
	{
		rollno=num;//storing in local variables
		stuname=name;
		stuage=age;
	}
	void printmethodwithvalues()
	{
		System.out.println(rollno+" "+stuname+" "+stuage);//Printing the local variables
	}
	
	/*-------------------------------------------------------------------------*/
	
	//Type-3 constructor with no parameter //and also example for Constructor overloading
	Methodclass1()//Default constructor
	{
		System.out.println("inside constructor with no paramaters");
	}
	//constructor with parameter
	Methodclass1(int no,String sname)//Parameterized constructor
	{
		System.out.println("inside constructor with parameters: "+no+" "+sname);
	}
}
