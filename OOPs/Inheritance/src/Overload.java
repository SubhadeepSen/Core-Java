class A3{
	
	int i,j;
	A3(int a,int b){
		i=a;
		j=b;
	}
	void show(){					
		System.out.println("i and j : "+i+" "+j);
	}
}

class B3 extends A3{
	int k;
	B3(int a,int b,int c){
		super(a,b);
		k=c;
	}
	
	void show(String msg){      	//overload show() since type signature does not match         
		    			
		System.out.println(msg+k);
	}
}


class Overload {

	public static void main(String[] args) {
		B3 obj=new B3(2,3,4);
		obj.show();
		obj.show("This is K : ");         

	}

}
