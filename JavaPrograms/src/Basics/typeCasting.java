package Basics;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//upcasting -- automatic: Smaller to larger
		
		int intvalue=100;
		long longvalue= intvalue;
		System.out.println(longvalue);
		
		float floatvalue= 10.3F;
		double doublevalue =floatvalue;
		System.out.println(doublevalue);
		
		//Downcasting- manually: Larger to smaller, Converting higher values to smaller values, sometimes we may lose day if we follow the same method as upcasting,
		//that’s why we have to manually add it by reducing thr size first then 
		
		long longval=10000;
		int intval=(int)longval;
		System.out.println(intval);
		
		double doubleval= 10.44; //output will 10, loss of data due to converting from larger to smaller
		int intval1=(int)doubleval;
		System.out.println(intval1);
	}

}
