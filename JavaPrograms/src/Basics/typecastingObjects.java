package Basics;

class Parent {
    void m1() {
        System.out.println("Inside Parent");
    }
}

class Child extends Parent {
    void m2() {
        System.out.println("Inside Child");
    }
}

public class typecastingObjects extends Child {  // Renamed class for clarity

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    	typecastingObjects c = new typecastingObjects();
        c.m1();  // Inherited from Parent
        c.m2();  // Inherited from Child

        // Upcasting - creating a reference for Parent with Child object
        Parent p = new typecastingObjects(); // By this, you can access only Parent methods, not Child methods
        p.m1();
        
        // Downcasting - explicitly casting Parent to Child
        Parent par = new Child();
        
        if (par instanceof Child) {  // Check before downcasting
            Child c1 = (Child) par;
            c1.m1();  // Calling Parent method
            c1.m2();  // Calling Child method
        } else {
            System.out.println("Cannot downcast");
        }

        System.out.println("Hello");
    }
}


/*TYPE CASTING – Converting type of data
TWO TYPES:
•	Upcasting/widening – it is a automatic process , Converting smaller values to higher values
•	Down casting/narrowing- Converting higher values to smaller values, sometimes we may lose day if we follow the same method as upcasting, that’s why we have to manually add it by reducing the size first then
We can use it for objects and primitive data types 
Important: Object upcasting
Parent class reference can use child class’s object
Parent p = new Child();
Eg:  Child ch = (Child) p; in this case, the child and p mmust have some relationship  (either parent to child or child to parent) other wise it is invalid
*/