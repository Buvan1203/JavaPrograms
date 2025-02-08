package BasicPrograms;

public class ReverseanInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5436;
		int temp = 0;
		int digit;
		
		while(num!=0)
		{
			digit=num%10; //Extract last digit ->1st -6, 2nd->3, 3rd->4, 4th->5
			temp=temp*10+digit;  //0+6, 60+3, 630+4, 6340+5
			num=num/10;      //543, 54, 5, 0
		}
		System.out.println(temp);
	}

}
