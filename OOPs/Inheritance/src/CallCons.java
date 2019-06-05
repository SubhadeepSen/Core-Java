class A1{
	A1(){
		System.out.println("Insides A1's Constructor.");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("Insides B1's Constructor.");
	}
}

class C1 extends B1{
	C1(){
		System.out.println("Insides C1's Constructor.");
	}
}
class CallCons {

	public static void main(String[] args) {
		C1 c=new C1();

	}

}
