package BasicPrograms;

public class FindDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,34,65,87,32,54,23,23,657,23,65};
		int count=0;
		int target=23;
		for(int value:arr)
		{
			if(value==target)
				count++;
		}
		System.out.println("23 present at "+count+" times");
	}

}
