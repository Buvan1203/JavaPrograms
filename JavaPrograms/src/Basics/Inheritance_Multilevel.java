package Basics;

class parent
{
	String sA="Hello, i am from class parent";
	void displayA()
	{
		System.out.println(sA);
	}
}

class child extends parent
{
	String sB="Hello, i am from class child";
	void displayB()
	{
		System.out.println(sB);
	}
}


class grandchild extends child
{
	String sC="Hello, i am from class grandchild";
	void displayC()
	{
		System.out.println(sC);
	}
}

public class Inheritance_Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		grandchild objC = new grandchild();
		
		objC.displayA();
		objC.displayB();
		objC.displayC();
		
	}

}
