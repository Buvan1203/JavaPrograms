package Keyword;

class finalkeyword
{
	 final int x=32; //final variable
	 
	 final void m()//final method
	 {
		 System.out.println("inside finalkeyword class");
	 }
	 
}

class finalkeyword1 extends finalkeyword
{
	void m1()
	{
		//x=7;// it wwill show error
		int y=1;
	}
	
	/*void m()
	{
		System.out.println("'inside finalkeyword1 class");
	}*/
}
public class keyword_FINAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalkeyword obj = new finalkeyword();
		System.out.println(obj.x);
		obj.m();
	}

}


/*FINAL Keyword – 
•	Final variable- we can’t change the value of the final variable, it is constant
•	Final method- if we create a method as final, we cannot (inherit) extend into another class we can’t override or overload, can’t change it
•	Final class- we cannot extend the class
*/