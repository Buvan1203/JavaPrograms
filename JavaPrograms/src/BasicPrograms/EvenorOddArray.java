package BasicPrograms;

public class EvenorOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33,5,2,5,6,7,9,32,33};
		int counteven=0;
		int countodd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				counteven++;
			}
			else
			{
				countodd++;
			}
		}
		System.out.println("Even: "+counteven);
		System.out.println("Odd: "+countodd);
	}

}
