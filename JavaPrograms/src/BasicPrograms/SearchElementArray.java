package BasicPrograms;

public class SearchElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=45;
		int arr[]= {2,34,44,65,45,65};
		boolean element=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("element found at index: "+i);	
				element=true;
			    break;
			}
		}
		if(element=false)
		System.out.println("Element not found");

	}

}
