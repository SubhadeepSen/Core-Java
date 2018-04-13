package main;

import implementation.Java8;
import java8interface.Java8Interface;

public class MainClass {

	public static void main(String[] args) {
		// Testing Java8Interface

		Java8 java8 = new Java8();

		// Calling the overridden method
		/*For calling the overridden default method, If commented in the
		implemented class, uncomment it*/
		java8.display();

		// Calling the default method without overriding
		java8.show();

		// Calling the static method using interface name
		Java8Interface.print();
	}

}
