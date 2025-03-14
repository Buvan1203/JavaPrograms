package Basics;

public class MethodOverLoading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Polymorphism – One thing can have many forms
•	Method overloading – One class have many methods with same name with different set of parameters (we can have diff return types also, doesn’t impact)
•	Constructor overloading – same as method overloading, we must create constructor with diff set of parameters and create object based on that
INTREVIEW QUESTION: Can we overload main method? YES WE CAN CREATE MULTIPLE METHODSS WITH NAME MAIN, WE ONLY CONSIDER PARAMETRE DIFFERENCE IN OVERLOADING*/

		MethodOverloading1 obj = new MethodOverloading1();
		obj.sum(); //Method with same name and different set of parameters and return type can be anything
		obj.sum(65, 35);
		int d=100;
		int f=200;
		int k=345;
		obj.sum(d,f,k);
		
		double m=obj.sum(5.6,7);
		System.out.println(m);
	}

}
