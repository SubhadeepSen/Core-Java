package thisConcept;


/*Inside anonymous inner class 'this' refers to the object of itself where as inside Lambda Expression 
'this' refers to the current class. Which means anonymous class creates an object of the interface where as 
Lambda Expression does not create any object instead it refers to the class inside which it is being created, 
but the return value by Lambda Expression behaves like an instance.*/
public class ThisConcept {

	public static void main(String[] args) {

		Display disp = new Display() {

			@Override
			public void display() {
				System.out.println(this);
			}

			@Override
			public String toString() {
				return "Anonymous Inner Class";
			}
		};

		disp.display();

		ThisConcept con = new ThisConcept();
		con.verifyThis();
	}

	public void verifyThis() {
		Display display = () -> {
			System.out.println(this);
		};
		display.display();
	}

	@Override
	public String toString() {
		return "ThisConcept Class";
	}
}
