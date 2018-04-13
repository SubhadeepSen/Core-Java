package implementation;

import java8interface.Java8Interface;

public class Java8 implements Java8Interface {

	/*By default abstract methods will be overridden, not other methods. If you want to override default then
	you have to write the overridden version of that method*/
	
	@Override
	public void display() {
		System.out.println("Overridden Abstract Method : display()");
	}
	
	public void show() {
		System.out.println("Overridden default Method : display()");
	}

}
