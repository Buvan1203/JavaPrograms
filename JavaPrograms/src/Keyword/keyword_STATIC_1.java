package Keyword;

public class keyword_STATIC_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(keyword_STATIC.a);//PRINTING THE STATIC VARIABLE VALUE FROM ANOTHER CLASS USING CLASSNAME.VARIABLENAME
		keyword_STATIC.m1(); //ACCESSING THE STATIC METHOD FROM ANOTHER CLASS USING CLASSNAME.METHODNAME
		
		System.out.println(keyword_STATIC.s);
		System.out.println(keyword_STATIC.s.length());
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
