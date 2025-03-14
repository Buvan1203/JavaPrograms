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
		
		//using Iterator
		Iterator <Entry<Integer, String>>  it= hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());//will return entry set, so both value and key will be printed
		}
	
	}

}
