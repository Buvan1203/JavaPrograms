package Keyword;

public class keyword_STATIC {

	static int a=5;//static variable
	
	static String s="Static";
	
	static void m1()//static method
	{
		System.out.println("inside static method without object");
	}
	
	void m2()//mon-static
	{
		System.out.println("inside non static method");
		System.out.println(a);//accesssing static variable without restrictions
	}
	
	public static void main(String[] args) { //main method also static
		// TODO Auto-generated method stub

		System.out.println("am static variable without object: "+a);//printing static variable without object
		m1();//calling static method without object
		
		keyword_STATIC obj = new keyword_STATIC();
		obj.m2();
		
		/*Static – can use in both methods and variables
Static methods and variables can be directly accessible without objects
Main is also a static method, and we can access non static method and variables using objects
Non static method has no restriction, we can access static/non static methods and variables (eg: regular method outside the main method)
access static variable of another class is also possible without objects. For that,  we have to use classname (anotherclassname.variable)
INTREVIEW QUESTIONS example for static : (System.out.println->System is a predefined class, contains an static out variable and println is a static method)
*
*/
		
	}

}
