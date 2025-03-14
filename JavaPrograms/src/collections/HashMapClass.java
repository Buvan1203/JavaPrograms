package collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap hm= new HashMap();/ hETERO OR
		//Map hm= new HashMap();
		HashMap <Integer, String> hm= new HashMap<Integer, String>();//TO SPECIIFC DATA-STRING
		
		hm.put(101,"hello");
		hm.put(101,"heo"); //duplicates - key will replace the latest value
		hm.put(102,"hello");
		hm.put(103,"hi");
		hm.put(104,"welcome");
		hm.put(105,"hello");//duplicate values allowed
		System.out.println(hm);
		
		
		//to get specific value using key''
		System.out.println(hm.get(105));
		
		//to get all the keys
		System.out.println("Keys");
		System.out.println(hm.keySet());
		//to get all the VAALUES
		System.out.println("Values");
		System.out.println(hm.values());
		
		//TO GET BOTH KEY AND VALUE
		System.out.println(hm.entrySet());
		
		//to remove specific value
		hm.remove(103);
		System.out.println(hm);
		
		//enhanced for loop using key for iteratior
		for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));//using key to retrive value
		}
		
		System.out.println("using iterator");
		//using Iterator
		Iterator <Entry<Integer, String>>  it= hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next());//will return entry set, so both value and key will be printed
		
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//to clear
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}

/*MAP – Not related to set or list, it is independent interface
HASHMAP- 
•	It is a class implements Map interface and it stores value in a Set of key and values (pair) and key should be unique
•	Insertion order not preserved since it has no index
•	HashMap doesn’t have add function, instead we use put()
•	To remove- we can hashmapname.remove(key);
•	To access all keys -> hashmapname.keySet();
•	To access all values-> hashmapname.values ();
•	To access both keys and values -> hashmapname.entrySet();
•	Map also doesn’t support regular for loop since it has no index
•	We have to use enhanced for loop by accessing values using key
•	If we use iterator we’ll have to call both values and keys using entrySet: and return type for entry set is Iterator <Entry<Integer, String>>  
                 Syntax: Iterator <Entry<Integer, String>>  it= hm.entrySet().iterator();
*/
