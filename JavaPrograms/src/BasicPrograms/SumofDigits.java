package BasicPrograms;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=45634;
		int sum=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	}

}
