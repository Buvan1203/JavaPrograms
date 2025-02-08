package BasicPrograms;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To sort way 1
		int a[]= {4,6,2,4,7,3,1};
		System.out.println("Numbers Sorting way 1");
		System.out.println("before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting: "+Arrays.toString(a));
		System.out.println("Numbers Sorting way 2");
		//To sort way 2 without using sort method
		int arr[]= {3,6,1,4,7,8,3,9,5};
		System.out.println("before sorting: "+Arrays.toString(arr));
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("After sorting: "+Arrays.toString(arr));
		
		System.out.println("Character Sorting ");
		//To Sort characters
		char m[]= {'f','k','a','x','b','z'};
		System.out.println("Before sorting: "+Arrays.toString(m));
		Arrays.sort(m);
		System.out.println("Before sorting: "+Arrays.toString(m));
		
		System.out.println("String Sorting ");
		//To Sort Strings
		String s[]= {"hello","cello","aello","zello","bello"};
		System.out.println("Before sorting: "+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("Before sorting: "+Arrays.toString(s));
	}

}
