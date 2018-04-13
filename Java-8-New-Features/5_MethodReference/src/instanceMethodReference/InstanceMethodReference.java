package instanceMethodReference;

import interfaces.MethodReferenceInterface;

public class InstanceMethodReference {

	public static void main(String[] args) {
		
		InstanceMethodContainer imc = new InstanceMethodContainer();

		//Using Lambda Expression
		MethodReferenceInterface mriLam = () -> imc.instanceMethod();
		mriLam.display();
		
		//Reference to an Instance Method of a particular object : Replacement of the above Lambda Expression
		//Object :: InstanceMethodName	
		MethodReferenceInterface mriMethRef = imc::instanceMethod;
		mriMethRef.display();
	}

}
