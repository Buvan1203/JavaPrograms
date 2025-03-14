package Basics;

class A
{
	String s="Hello, i am from class A";
	void display()
	{
		System.out.println(s);
	}
}

class B extends A
{
	String s1="Hello, i am from class B";
	void display1()
	{
		System.out.println(s1);
	}
}

public class Inheritance_Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj =new B();//Created object for child class
		
		System.out.println(obj.s);// accessing parent using child class object
		System.out.println(obj.s1);
		obj.display1();
	}

}

/*Inheritance: Acquiring all the properties (Variables) and behavior(methods) from one class to another class is called inheritance using extends keyword
•	Parent class also called super class
•	Child class also called derived/Sub class
Advantage: reusability, to avoid duplication
Types:
•	Single – one parent one child
•	Multi-level - one parent one child chain
•	Hierarchy – one parent has multiple child
•	Multiple – multiple parents with single child (Class concepts doesn’t support multiple inheritance, we achieve this using interface only)
Java doesn’t support multiple inheritance  WHY??? Extends keyword can support with one class only, ambiguity issues(more than one duplicate methods) and also all classes

*/