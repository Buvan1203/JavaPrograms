package collections;

import java.util.*;


public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration-how to declare variables in arraylist
		//for hetero data
		ArrayList mylist=new ArrayList();//valid : child class with child reference
		//List mylist1 = new ArrayList();//Valid: Parent interface refernce with child class object 
	
		//for homo data
	     //ArrayList<Integer> mylist2=new ArrayList<Integer>();//Since arraylist supports heterogenous and we only want to use homogeneous like numbers only we have to use this format, can use for string also
	    
		mylist.add(100); //to add/store
		mylist.add(5);
		mylist.add("hello");
		mylist.add('A');
		mylist.add(null);
		mylist.add(23.43);
		mylist.add("gro");
		mylist.add(234);
		
		//0r
		ArrayList <String> mylists=new ArrayList();//valid : child class with child reference
		//List mylist1 = new ArrayList();//Valid: Parent interface refernce with child class object 
	
		//for homo data
	     //ArrayList<Integer> mylist2=new ArrayList<Integer>();//Since arraylist supports heterogenous and we only want to use homogeneous like numbers only we have to use this format, can use for string also
	    
		mylists.add("hello");
		mylists.add("r");
		mylists.add("er");
		mylists.add("rg");
		mylists.add("gro");
		mylists.add("234fe");
		System.out.println("Printing the arraylist homo: "+mylists);
		System.out.println("Size of an arraylist: "+mylist.size());//to find size
		System.out.println("Printing the arraylist: "+mylist);
	    
		mylist.remove(4);
		System.out.println("Printing the arraylist: "+mylist);
		
		mylist.add(2,"hi");//To insert
		System.out.println("Printing the arraylist: "+mylist);
		
		mylist.set(3, "hi");//tp replace
		System.out.println("Printing the arraylist: "+mylist);
		
		System.out.println("Printing the specific element: "+mylist.get(4));//to get specific element
		System.out.println("Printing the arraylist: "+mylist);
		
		
		//to read the data from arraylist
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		System.out.println("enhanced loop");
		//enhanced loop - we'll have to use object since the list has heterogenous data
		for(Object j:mylist)
		{
			System.out.println(j);
		}
		
		System.out.println("iterator");
		//Iterator- specific to collection, this iterator method will return iterator type of object that why we stores in iterator object referencee
		Iterator it= mylist.iterator();
		while(it.hasNext())//using iterator object we'll check if element is presnet
		{
			System.out.println(it.next());//using iterator object , will print the value
		}
		
		//to reomve multiple elements-this is the only way to remove multiple elemets in Arra list
		ArrayList mylist2= new ArrayList();
		mylist2.add('A');
		mylist2.add(null);
		mylist2.add(23.43);
		System.out.println("removing multiple elements");
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		//to clear all the elements
		mylist.clear();
		System.out.println(mylist.isEmpty());//to check if list is empty or not
	}

}

/*ARRAYLIST:
•	Array list is also called dynamic array, no need to specify size
•	Arraylist allows heterogenious (different data types)
•	Insertion order is preserved(index)
•	Duplicate elements are allowed
•	Multiple nulls are allowed

	ArrayList mylist=new ArrayList();//valid : child class with child reference
	List mylist1 = new ArrayList();//Valid: Parent interface refernce with child class object
	ArrayList<Integer> mylist2=new ArrayList<Integer>();  //Since arraylist supports heterogenous and we only want to use homogeneous like numbers only we have to use this format, can use for string also
	ArrayList class have some predefined methods
•	Objectname.add(); //To add/store the data into array list
•	Objectname.add(index, value); //to insert element 
•	Objectname.size(); //To find the size of the ArrayList
•	Objectname.remove(index); //To remove an value from arraylist using index
•	Objectname.set(index, value); //to replace/modify 
•	Objectname.get (index);//to access specific element
	For..each enhanced loop , we have to use object since it stores heterogeneous(eg: for(Object j:mylist){})
	Iterator- method already available in the list, specific to collections only. this iterator method will return iterator type of object that why we stores in iterator object reference
	Using iterator object will check, if the element is present or not using hasNext() and will print using next() in the while loop
	Iterator method type is iterator that’s why whenever we call iterator method we’ll store the value in iterator variable (Iterator it=mylist.iterator)
	If my list has homogeneous data- Iterator <Interger> it = mylist.iterator
	If my list has heterogeneous data- Iterator <Object > it = mylist.iterator
*/
