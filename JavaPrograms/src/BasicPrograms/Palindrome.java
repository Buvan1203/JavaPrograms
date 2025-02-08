package BasicPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=434353434;
		int digit=0;
		int result=0;
		int temp=num;
		while(num!=0)
		{
			digit=num%10;
			result=result*10+digit;
			num=num/10;
		}
		if(result==temp)
			System.out.println("Palindrome "+temp);
		else
			System.out.println("Not a Palindrome "+temp);
	}

}
