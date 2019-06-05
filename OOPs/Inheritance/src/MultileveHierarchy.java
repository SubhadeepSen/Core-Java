class Car{
	Car(){
		System.out.println("Class Car");
	}
	
	void vehicleType(){
		
		System.out.println("Vehicle Type: Car");
}
}

class Maruti extends Car{
	
	Maruti(){
		System.out.println("Class Maruti");
	}
	
	void brand(){
		System.out.println("Brand: Maruti");
	}
	
	void speed(){
		System.out.println("Max: 90kmph");
	}
}

class Maruti800 extends Maruti{
	
	Maruti800(){
		System.out.println("Maruti Model: 800");
	}
	
	void speed(){
		System.out.println("Max: 80kmph");
		
	}
	
}
class MultileveHierarchy {

	public static void main(String[] args) {
		
		Maruti800 Ob=new Maruti800();
		
		Ob.vehicleType();
		Ob.brand();
		Ob.speed();
		

	}

}
