package java8interface;

/*In Java 8, An Interface can contain n number of abstract methods, n number of final constant fields
and n number of concrete methods as well. But the concrete methods have to be declared with either 
default access specifier or static keyword. default methods are default to the interface and can be 
called using the object of the class that implements the interface or can be overridden in the implemented
class providing a new definition for that method. Static methods can be called only by the interface 
name, not by any object or class that implements the interface and cannot be overridden in the 
implemented class*/

public interface Java8Interface {

	int i = 10;

	//abstract method
	public void display();

	//default method
	default void show() {
		System.out.println("Default Method show()");
	}

	//static method
	public static void print() {
		System.out.println("Static Method print()");
	}
}
