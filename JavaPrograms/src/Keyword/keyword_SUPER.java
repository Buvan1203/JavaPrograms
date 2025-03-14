package Keyword;

class one
{
	String str="one";
	void m()
	{
		System.out.println("inside parent");
	}
}

class two extends one
{
	String str="two";
	void m()
	{
	System.out.println(str);//child class value
	System.out.println(super.str);//parent class value
	super.m();//to access immediate parent method
	}
}

public class keyword_SUPER {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two obj = new two();
		obj.m();//accessing child method using child class object 
		
	}

}
/*Super Keyword- (related to inheritance)
Super keyword always represents immediate parents variables or methods
When to use- Scenario – overloaded method presents in both child and parent class. if you call the method using child class object but want to print the parent method, then we’ll use super keyword
*/