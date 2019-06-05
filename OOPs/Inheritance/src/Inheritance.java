class Parent{
	
	int i,j;
	void showp(){
		System.out.println("i and j from Parent Class: "+i+" "+j);
	}
}

class Child extends Parent{
	
	int k;
	void showc(){
		System.out.println("K from Child Class: "+k);
	}
	
	void sum(){
		System.out.println("i+j+k : "+(i+j+k));
	}
}


class Inheritance {

	public static void main(String[] args) {
	
		Parent superOb=new Parent();
		Child subOb=new Child();
		
		superOb.i=10;
		superOb.j=20;
		
		System.out.println("Contents Of Parent : ");
		superOb.showp();
		
		System.out.println();
		
		subOb.i=7;
		subOb.j=8;
		subOb.k=9;
		
		System.out.println("Contens Of Child Class : ");
		
		subOb.showp();
		subOb.showc();
		System.out.println("Sum of i,j and k is : ");
		subOb.sum();
		
	}

}
