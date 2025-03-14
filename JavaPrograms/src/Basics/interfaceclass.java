package Basics;

interface interface1 {

	int num=1; //by default variables are final and static
	String name="Boo";
	
	void shape(); //abstract method - no implementation, will implement in the class
	
	default void shape1()//default method
	{
		System.out.println("inside interface- default method");
	}
	
	static void shape2()//static method
	{
		System.out.println("inside interface- static method");
	}

}

public class interfaceclass implements interface1
{
	public void shape()//abstract method implementation
	{
		System.out.println("am interface's abstract method's implementation inside class");
	}
	
	public static void main(String[] args)
	{
		interface1 obj= new interfaceclass();//created an object with class and interface reference
		System.out.println("using an object with class and interface reference");
		obj.shape(); //calling abstarct method using an object
		obj.shape1(); //calling default method using an object
		interface1.shape2(); //calling static method using interface name
		
		interfaceclass obj1 = new interfaceclass(); //created an object with class and class reference
		System.out.println("using an object with class and class reference");
		obj1.shape();//calling abstarct method using an object
		obj1.shape1();//calling default method using an object
		
		//to access variables - no need of objects since its static by default
		System.out.println("printing interface variables without object since its static");
		System.out.println(interface1.num);
		System.out.println("printing interface variables without object since its static");
		System.out.println(interface1.name);
	}
	
}



/*Data Abstraction
Process of hiding the implementation only showing functionality to the user, can’t directly access variables methods
To achieve abstraction
•	Abstract class
•	Interface (100% abstraction can be achieved only using interface)
INTERFACE
•	Interface is a blueprint of class (like class – we must have interface keyword; interface can also have methods and variables)
•	Interface contains only final and static variables (by default it will be static or final)
•	Interface contains abstract methods with no implementation (default method and static method with implementation after java 8)
•	Abstract methods have no body only declaration
•	All methods in interface are by default public (even though you didn’t specify explicitly)
•	Interface supports multiple inheritance
•	Keyword- A class extends another class, an interface extends another interface, but class implements interface (reason: interface contains abstract methods i.e., method with declaration only no implementation, to implement that we need a class, that’s why we are using implement keyword ->class implements interface) 
•	class to interface is not possible because interface doesn’t allow any implementation
•	Interface with class is useful, without class we can’t implement interface
•	We can create objects reference, but we cannot instantiate (object reference = new class name) that new class name is an object instantiate
•	Reason -> when we implement interface using class, the class will implement everything, that’s why we create an object for class with interface object interface 
•	Interface obj = new classname();  ->Interface variable will hold the object of child class
•	All abstract methods in interface should be implemented in the class. Otherwise we’ll get an error
•	We can only access default methods and abstract methods using interface object reference
•	To access static methods inside interface we’ll have to use interfacename.method name (similar to class)
*/