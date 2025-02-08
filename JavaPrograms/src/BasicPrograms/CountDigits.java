package BasicPrograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23444535;
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Total number of digits: "+count);
	}

}
