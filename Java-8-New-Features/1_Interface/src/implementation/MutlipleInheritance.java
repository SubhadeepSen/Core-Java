package implementation;

import java8interface.Left;
import java8interface.Right;

//Removes ambiguity in case multiple inheritance when both the interfaces have same method

public class MutlipleInheritance implements Left, Right {

	@Override
	public void move() {
		//default definition
		System.out.println("New Definition");
		
		//Calling Left interface method move()
		Left.super.move();
		
		//Calling Right interface method move()
		Right.super.move();
	}

}
