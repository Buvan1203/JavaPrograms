package BasicPrograms;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome";
		String rev="";
		//way-1-using charAt method(fetching each index and store it in another string
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//way-2 - converting string to character Array and fetch each character using index
		s="Hello";
		rev="";
		System.out.println(s);
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		
		//way-4- using stringbuffer class
		StringBuffer s1= new StringBuffer("Hello Hi");
		System.out.println(s1.reverse());
				
		//way-4- using stringbuilder class
		StringBuilder s2= new StringBuilder("Hello");
		System.out.println(s2.reverse());
	}

}
