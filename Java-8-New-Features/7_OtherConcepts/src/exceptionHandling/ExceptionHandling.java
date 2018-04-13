package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {

		Division div = (a, b) -> {
			try{
				System.out.println(a / b);
			}catch(ArithmeticException e){
				System.out.println("Division Exception");
			}
		};
		
		div.performMath(10, 2);
		div.performMath(10, 0);
		
	}

}
