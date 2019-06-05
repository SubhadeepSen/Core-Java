class Xot{
	Xot display(){
		System.out.println("Method display.....");
		return this;
	}
	Xot show(){
		System.out.println("Method show.....");
		return this;
	}
}
class Chain {

	public static void main(String[] args) {
		
		new Xot().show().display();
	}

}
