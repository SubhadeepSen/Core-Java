class A2{
	
	int i,j;
	A2(int a,int b){
		i=a;
		j=b;
	}
	void show(){					// this show() is overridden by show() of B2.Use final for not overridden
		System.out.println("i and j : "+i+" "+j);
	}
}

class B2 extends A2{
	int k;
	B2(int a,int b,int c){
		super(a,b);
		k=c;
	}
	
	void show(){                //overrides show() in A2 
		
		//super.show();    			// super keyword is used to call superclass' show()
		System.out.println("K : "+k);
	}
}


class MethodOverriding {

	public static void main(String[] args) {
		B2 obj=new B2(2,3,4);
		obj.show();          //calls show() in B

	}

}
