package main;

import functionalInterfaces.SimpleInterface;

/*Lambda Expression is a replacement of Anonymous Inner Class.
It is a function which provides the benefits of functional programming.
It has the capability to return a method/behavior to a variable which in turn can be passed to another method 
or Lambda Expression.
It helps to write more readable, maintainable and concise code.
It helps to use APIs very easily and effectively.
It enables parallel processing.
***Only functional interface having the same method signature can hold the reference of Lambda Expression as
if the lambda expression were a method [interface method signature]
***To execute the Lambda Expression we will have to call the interface method using the reference returned the
Lambda Expression.
*/

public class SimpleLambdaExpression {

	public static void main(String[] args) {
		SimpleInterface si = () -> System.out.println("Simple Lambda Expression");
		si.display();
	}

}
