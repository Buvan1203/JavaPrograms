package Basics;

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Encapsulation – Wrapping data and methods in single class, can’t be visible to outside of the class 
•	we can’t directly access the variables of the encapsulated class using object like we usually do, 
•	Instead, we can access only methods of the encapsulated class using object and that method will access variables of the encapsulated class, 
•	we must create private variables (Class Variable) in encapsulated class
•	we must have 2 methods for each private variable (setters and getters method), one is to set the value and other is get the value – (Secured feature) – 
ECLIPSE SHORTCUT : to generate setters and getters method automatically in eclipse define private variables and then click on source ->Generate getters and setters->Select all->Generate
•	we can use this keyword to access class variables (private variables in the encapsulated class)*/

		Encapsulation1 obj= new Encapsulation1();
		
		obj.setnumber(5500);//for way-1
		
		obj.setId(5);
		int id=obj.getId();
		
		obj.setDOB(1999);
		int dob= obj.getDOB();
		
		obj.setUsername("boo");
		String name= obj.getUsername();
		
		System.out.println(id+" "+dob+" "+name);
	}

}
