package Basics;

public class Interface_Multipleinheritance implements Interface1, Interface2 {

	public void m1()
	{
		System.out.println(Interface1.num);
	}
	
	public void m2()
	{
		System.out.println(Interface2.num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Multipleinheritance obj = new Interface_Multipleinheritance();
		
		obj.m1();
		obj.m2();
	}

}


/*MULTIPLE INHERITANCE: 
•	We can achieve, multiple inheritance using interface i.e, multiple interface (many parents) implements by single class (child)
•	We can implement 2 interface in a single class
*/