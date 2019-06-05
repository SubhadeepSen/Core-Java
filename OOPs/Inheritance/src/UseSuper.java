class X{
	int i;
}

class Y extends X{
	int i;				//this i hides the i in X
	
	Y(int a,int b){
		
		super.i=a;		//i in X
		i=b;			//i in Y
	}
	
	void show(){
		System.out.println("i in SuperClass: "+super.i);
		System.out.println("i in SubClass: "+i);
	}
}

class UseSuper {

	public static void main(String[] args) {
		
		Y subOb=new Y(1,2);
		subOb.show();

	}

}
