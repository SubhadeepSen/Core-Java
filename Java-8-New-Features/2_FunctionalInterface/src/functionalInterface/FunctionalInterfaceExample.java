package functionalInterface;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		FunctionalInterfcae fi = new FunctionalInterfcae() {
			@Override
			public void display() {
				System.out.println("Functional Interface display() method");
			}
		};
		
		fi.display();
	}

}
