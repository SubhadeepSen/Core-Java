/*this program is not wrong.It shows that a private variable
cannot be accessed by its subclass even*/

class A{
	int i;             //public by default
	private int j;		//private to A
	
	void setA(int x,int y){
		i=x;
		j=y;
	}
}

class B extends A{
	int total;
	void sum(){
		total=i+j;		//ERROR,j is not accessible here since it is private to A
	}
	
}

class Access {

	public static void main(String[] args) {
		
		B subOb=new B();
		subOb.setA(10, 20);
		subOb.sum();
		System.out.println("Total: "+subOb.total);

	}

}
