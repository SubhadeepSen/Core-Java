class Outer{
	
	int outer_x=100;
	
	void test(){
		Inner inner=new Inner();
		inner.display();
	}
	
	class Inner{
		void display(){
			
			System.out.println("display from InnerClass: outer_x = "+outer_x);
		}
	}
}
class InnerDemo {

	public static void main(String[] args) {
		
		Outer outer=new Outer();
		outer.test();

	}

}
