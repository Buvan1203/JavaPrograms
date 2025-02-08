package Basics;

public class Operators {

	public static void main(String args[])
	{
		int a=55, b=32;
		//Arithmetic
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//Relational/Comparison ->Returns boolean value
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		//Logical - can use only on Boolean variables and also return boolean values
		boolean x=true, y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		System.out.println((55<100)&&(10<50));
		//Increment and decrement
		System.out.println(a++);//55 ->post-increment
		System.out.println(b--);//32 ->post-decrement
		System.out.println(a);//56
		System.out.println(b);//31
		a=55;b=32;
		System.out.println(++a);//56 ->Pre-increment
		System.out.println(--b);//31 ->pre-decrement
		//Assignment
		System.out.println(a+=5);//61, a=a+5
		System.out.println(b-=5);//26, b=b-5
		System.out.println(a*=5);//a=a*5
		System.out.println(b/=5);//b=b/5
		System.out.println(b%=5);//b=b%5
		//Conditional/Ternary -> variable= Expected condition ? value 1:vale 2
		a=5;b=6;
		System.out.println((a>b)?100:false);
		System.out.println((a==b)?100:false);
		System.out.println((a<=b)?a:b);
		System.out.println((a>18)?"ok":"Not ok");
	
	
	}
}
