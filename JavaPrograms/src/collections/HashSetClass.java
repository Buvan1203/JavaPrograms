package collections;

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet myset= new HashSet();
		
		myset.add(100);
		myset.add("hello");
		myset.add("hi");
		myset.add("hello");
		myset.add(34.54);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);//automatically removes the duplicate values
		
		//or
		
        HashSet <Integer> myset2= new HashSet();
		
		myset2.add(100);
		myset2.add(34);
		myset2.add(7);
		myset2.add(5);
		
		System.out.println(myset2);
		//to remove, we cant use indexsince there is no index-
		myset.remove("hi");//we have to specify the value
		System.out.println(myset);
		
		//Insertion not posiible
		//Accessing specific element is not posiible since no index
		//Converting hashset to arraylist - to access elements since arraylist has index
		ArrayList arlist= new ArrayList(myset);
		System.out.println(arlist);
		System.out.println(arlist.get(2));
		
		for(Object i:myset)//regualr for loop not possible since it has no index
		{
			System.out.println(i);
		}
		
		//using iterator
		Iterator <Object> it = myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//to find size
		System.out.println("size: "+myset.size());
		
		//to clearr
		myset.clear();
		System.out.println(myset);
		System.out.println(myset.isEmpty());
	}

}


/*•	Hashset allows heterogenious (different data types)
•	No Insertion order is preserved(no index)
•	Duplicate elements are NOT allowed, duplicates will automatically gets removed if any added
•	Multiple nulls are NOT allowed/ only single nulls are allowed
•	Insertion is not possible, since it has no index/order
•	Accessing specific element is not possible since no index
•	If we convert the set collection to arraylist collection, we can access the elements
•	We can use only enhanced for loop, cannot use normal for loop since we move by index in for loop
•	Set doesn’t have get method sice no index
*/