package Basics;

public class BasicClassandObject {
	
	/*Naming conventions in Java and Java MUST’S:
	 * only one class should be public(and that should be the class with main method)
•	Class name should always start with Uppercase characters
•	No space is allowed in class name
•	Class Name should not start with Number
•	Class Name can contain underscore, Numbers
•	Class Name should not contain Hyphen or special characters or spaces
•	“Always print same as in:” within the double quotes will consider this is as a string
•	Main method should always present inside the class
*/
	
	int id;
	String name;
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicClassandObject user1= new BasicClassandObject();
		user1.id=23;
		user1.name="Boo";
		user1.display();
		
		BasicClassandObject user2= new BasicClassandObject();
		user2.id=44;
		user2.name="koo";
		user2.display();
	}

}
