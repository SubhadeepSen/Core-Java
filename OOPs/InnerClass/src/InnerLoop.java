class Outerl{
	int outer_x=100;
	
	void test(){
		for(int i=0;i<10;i++){
			class Inner{
				void display(){
					System.out.println("Outer_x = "+outer_x);
				}
			}
			Inner inner=new Inner();
			inner.display();
		}
			
	}
}
class InnerLoop {

	public static void main(String[] args) {
		
		Outerl outer=new Outerl();
		outer.test();
	}

}
