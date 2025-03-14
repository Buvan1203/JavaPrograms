package Basics;

public class MethodOverloading1 {

	int a=9;
	int b=8;
	void sum()
	{
		System.out.println(a+b);	
	}
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	double sum(double x, int y)
	{
		return(x+y);
	}
}
