package Basics;

public class MainMethodOverloading {
	
	void main()
	{
		System.out.println("inside overloading main method");
	}
	
	void main(int num)
	{
		System.out.println("inside overloading main method with paramter: "+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainMethodOverloading obj = new MainMethodOverloading();
		 
		obj.main();
		
		obj.main(5);
	}

}
