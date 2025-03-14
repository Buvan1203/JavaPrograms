package Basics;

public class wrapperclass_Dataconversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String to primitive data type
		//STRING TO INT
		
		//String s="Hello"; - can't convert all letter to integer, not valid
		String s="12345";
		System.out.println(Integer.parseInt(s));
		
		String s1="10";
		String s2="30";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		//STRING TO DOUBLE
		String s3="10.33";
		String s4="23.543";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		//String to boolean
		String s5="true";//true
		String s6="false";//false
		String s7="Hello";//false
		System.out.println(Boolean.parseBoolean(s5));
		System.out.println(Boolean.parseBoolean(s6));
		System.out.println(Boolean.parseBoolean(s7));
		
		//Primitive to String
		int a=10;
		double b=10.4;
		char c='d';
		boolean d=true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
	}

}


/*WRAPPER CLASS
•	For every primitive data type, there will be wrapper class, (string is not wrapper class because its not a primitive type)
•	We use this wrapper class when we want to convert data type one to another
•	We convert only in 2 format (String to primitive or primitive to String)
•	Int->Integer
•	Float-> Float
•	double->Double
•	Char->Character
•	Boolean->Boolean
Possible:
String->Int => Interger.paresInt(String value)
String->Double=> Double.paresDouble(String value)
String->Boolean => Boolean.parseBoolean(String Value)

Primitive to String -> String.valueOf(int)

NOT POSSIBLE
String ->Char – NOT POSSIBLE (we can’t convert multiple characters into single characters, BUT CHARACTER TO STRING IS POSSIBLE)

*/