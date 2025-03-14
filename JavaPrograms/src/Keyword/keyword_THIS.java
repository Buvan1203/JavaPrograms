package Keyword;

public class keyword_THIS {
	
	
	int x, y;
	
	void sum(int x, int y)
	{
		x=x;//0
		y=y;//0
	}
	void sum1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keyword_THIS obj= new keyword_THIS();
		
		obj.sum(5,6); 
		obj.display();//output will be zero we didnt use this keyword both local and class variables are same, same applicable to constructor
		obj.sum1(5,6);
		obj.display();//output will be 5 and 6
	}

	
	/*This- we use this keyword to differentiate between class variables and local variables, when we use this keyword before the variables that means that variable is class variable*/
}
