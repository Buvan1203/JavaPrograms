package BasicPrograms;

public class CountEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=2526336456757567245L;
		int evencount=0, oddcount=0;
		while(num!=0)
		{
			if(num%2==0)
			{
				evencount++;
			    num=num/10;
			}
			else
			{
				oddcount++;
				num=num/10;
			}
		}
		System.out.println("Even "+evencount+" odd "+oddcount);
	}

}
