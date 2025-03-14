package Basics;

class A1 
{
	int a=0;
	int methoda2()
	{
	return a;
	}
}

class b2 extends A1
{
	int methoda2()
	{
		a=6;
	return a;
	}
}

class c3 extends A1
{
	int methoda2()
	{
		a=7;
	return a;
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		b2 obj1= new b2();
		//System.out.println(obj1.methoda2());  
		System.out.println(obj1.methoda2()); 
		
		c3 obj2= new c3();
		//System.out.println(obj1.methoda2());  
		System.out.println(obj2.methoda2()); 
	}
	
}


/*Method overriding – same class in both parent and child class, DECLARATION RETURN TYPE SHOULD BE SAME , only body should be different for these methods, and overriding is possible only with inheritance – because both methods declaration should be in parent and child
Method overloading doesn’t need inheritance
Difference between method overloading and overriding
Method overloading
•	Possible in single and multiple class(inheritance)
•	Method names are same but we should change the signature of the method
•	Belongs to polymorphism
Method overriding
•	Possible only in multiple class(inheritance)  - because we need both parent and child
•	Method names are same but we should NOT change the signature of the method
•	Belongs to Inheritance
*/