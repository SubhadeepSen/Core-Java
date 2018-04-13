package main;

import functionalInterfaces.OneArgMethodInterface;

/*When passing any value(s) through Lambda Expression, we do not need to specify the type(s) of the passed value(s)
in the Lambda Expression because the Lambda Expression gets the information from the method of functional interface.
This concept is called Type Inference.
If a single parameter is passed to a Lambda Expression, then the parenthesis are not even required.
*/


public class TypeInference {

	public static void main(String[] args) {

		/*OneArgMethodInterface oami = (name) -> {
			String surName = "Einstein";
			System.out.println(name + " " + surName);
		};*/
		
		OneArgMethodInterface oami = name -> {
			String surName = "Einstein";
			System.out.println(name + " " + surName);
		};
		
		oami.display("Albert");
	}
}
