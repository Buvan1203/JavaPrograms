package Basics;

public class exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,5,2,4,6,8};
		System.out.println(arr[8]);//ArrayIndexOutOfBoundException
		
		String s=null;
		System.out.println(s.length());//NullPointerException
		
		int num=3445;
		System.out.println(num/0);//ArithmeticException
	}

}
