package Basics;

public class ObjectArray {

	public static void main(String[] args)
	{
		Object arr[]= {1,64,6,'a',"gelo",4};
		System.out.println("Enhanced loop: ");
		for(Object i:arr)
		{
			System.out.println(i);
		}
		System.out.println("Regular for loop: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
