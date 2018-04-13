package functionalInterface;

/*An interface having at most one abstract method and zero or one or more than one concrete methods (default, static)
is called a Functional Interface.
@FunctionalInterface annotation can be used to mark an interface as Functional Interface. But this annotation
is optional. If this annotation is used to an interface then it will not allow anybody to modify it, other way 
it helps to prevent further modification in future and also it will not allow you to add more than one abstract
method*/

@FunctionalInterface
public interface FunctionalInterfcae {

	public void display();
	
	//public void show();
}
