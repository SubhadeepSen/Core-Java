package main;

import java8interface.Java8Interface;

/*Instead of implementing the interface through class, we can use anonymous inner class concept to provide
implementation for the abstract methods. We can also pass the this anonymous inner class to a method or 
constructor which accepts objects in the reference of interface*/

public class AnonymousImplementationOfInterface {

	public static void main(String[] args) {

		Java8Interface java8 = new Java8Interface() {
			
			@Override
			public void display() {
				System.out.println("display() method from Anonymous Inner Class");
			}
		};
		
		java8.display();
		//we can also pass java8 object to another method or constructor
	}

}
