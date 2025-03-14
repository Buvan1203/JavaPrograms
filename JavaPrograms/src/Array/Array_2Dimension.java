package Array;

public class Array_2Dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=400;
		a[1][1]=500;
 
		int b[][]= {
						{0,1,2},
						{4,5,6},
						{7,8,9}
					};
		
		//to find size of 2d array
		System.out.println("row length: "+b.length);
		System.out.println("col length: "+b[0].length);
		
		//to print
		System.out.println("Using regular For loop to print: ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();	
		}
		
		System.out.println("Using regular  Enhanced For loop to print: ");
		for(int arr[]:b) //Store it in array, each row will store it in each loop
		{
			for(int k:arr)
			{
				System.out.print(k+" ");
			}
			System.out.println();	
		}
	}

}
