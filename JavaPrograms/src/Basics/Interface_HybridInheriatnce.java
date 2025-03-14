package Basics;

class class1
{
	void methodfromparent()
	{
		System.out.println("method from parent class");
	}
}

public class Interface_HybridInheriatnce extends class1 implements Interface1, Interface2
{
	public void m1()
	{
		System.out.println("abstract method from child interface 1");
	}
	
	public void m2()
	{
		System.out.println("abstract method from child interface 2");
	}
	
	void methodfromgrandchildclass()
	{
		System.out.println("method from grandchild class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface_HybridInheriatnce obj = new Interface_HybridInheriatnce();
		obj.methodfromparent();
		obj.m1();
		obj.m2();
		obj.methodfromgrandchildclass();
		
		
	}

}

/*HYBRID INHERITANCE:
PARENT CLASS -> 2 INTERFACE CHILD -> SINGLE GRANCHILD CLASS
Eg: public class class1 extends class2 implements Interface1, interface2
*/
