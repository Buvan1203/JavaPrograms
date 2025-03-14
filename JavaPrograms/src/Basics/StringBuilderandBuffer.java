package Basics;

public class StringBuilderandBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String-Immutable(cannot change the value)
		String s="hello";
		s.concat("hi");
		System.out.println(s);//immutable-> hello
		
		
		//StringBuffer-mutable(can change the value)
		StringBuffer s1=new StringBuffer("hello");
		s1.append("hi");
		System.out.println(s1);//mutable-> hellohi
		
		
		//StringBuilder-mutable (can change the value)
		StringBuilder s2=new StringBuilder("hello");
		s2.append("hi");
		System.out.println(s2);//mutable-> hellohi
		
		
	}

}
