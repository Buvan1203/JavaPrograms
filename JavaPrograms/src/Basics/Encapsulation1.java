package Basics;

public class Encapsulation1 {
	
	private int id;
	private String username;
	private int DOB;
	
	//way 1 to assign values to the class variables - dump way  dont use this way
	void setnumber(int num)//
	{
		id=num;
	}
	int getnumber()
	{
		return id;
	}
	
	
	//way-2 instaed of creating method like above, we can use autogenerated getter and setterr in eclipse by go to source->Generate geetters and setters->select all->generate
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	
	
	

}
