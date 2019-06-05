class Test{
	int a;
	public int b;
	private int c;
	
	void setc(int i){
		c=i;
	}
	
	int getc(){
		return c;
	}
}
class Access {

	public static void main(String[] args) {
		
		Test Ob=new Test();
		Ob.a=10;
		Ob.b=20;
		//Ob.c=100;    //since c is private it cannot be accessed directly from outside of its class
		Ob.setc(100);  //c can be accessed through this method
		
		System.out.println("a , b  and  c :  "+Ob.a+ "  " +Ob.b+ "  "+Ob.getc());

	}

}
