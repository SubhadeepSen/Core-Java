package staticMethodReference;

import interfaces.MethodReferenceInterface;

public class StaticMethodReference {

	public static void main(String[] args) {

		//Using Lambda Expression
		MethodReferenceInterface mri = () -> StaticMethodContainer.staticMethod();
		mri.display();
		
		//Reference to a Static Method : Replacement of the above Lambda Expression
		//ClassName :: StaticMethodName
		
		MethodReferenceInterface mriRef = StaticMethodContainer::staticMethod;
		mriRef.display();
	}

}
