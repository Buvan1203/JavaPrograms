package BasicPrograms;

public class SwappingNumbers {

	public static void main(String args[])
	{
		//with using 3rd variable
		int a=5,b=6;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		//Without using 3rd variable
		int c=5,d=6;
		c=c+d;//11
		d=c-d;//5
		c=c-d;//6
		
		System.out.println(c);
		System.out.println(d);
		
	}
}
