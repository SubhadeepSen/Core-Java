package closureConcept;

import thisConcept.Display;

/*
Lambda Expression can access both class variables and local variables.
Modification to any local variable is not allowed inside Lambda Expression since it becomes final in it's 
declaration when it is being used inside Lambda Expression.
But it can modify class variables.
Prevention to modification of local variable is known as Closure as the value gets frozen inside Lambda Expression*/

public class ClosureConcept {
	
	private static int a = 10;

	public static void main(String[] args) {
		int b = 20;
		
		Display disp = () -> {
			a = 30;
		//Modification to 'b' is not allowed
			//b = 20;
			
			System.out.println(a + b);
		};
		
		disp.display();
	}

}
