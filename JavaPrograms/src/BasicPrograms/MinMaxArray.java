package BasicPrograms;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=0;
		int max=0;
		int arr[]= {23,45,76,23,21,87,9,32,56,87,2,12,35};
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Value is: "+min);
		
		max=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		System.out.println("Maximum Value is: "+max);
	}

}
