package Basics;


	
	class parent1
	{
		String sA="Hello, i am from class parent";
		void displayA()
		{
			System.out.println(sA);
		}
	}

	class child1 extends parent1
	{
		String sB="Hello, i am from class child";
		void displayB()
		{
			System.out.println(sB);
		}
	}


	class child2 extends parent1
	{
		String sC="Hello, i am from class grandchild";
		void displayC()
		{
			System.out.println(sC);
		}
	}

	public class Inheritance_Hierarchy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//One parent has many childs
		child1 obj= new child1();
		child2 obj1 = new child2();
		obj.displayA();
		obj1.displayA();
		//scceassing parent values from both childs
	}

}
