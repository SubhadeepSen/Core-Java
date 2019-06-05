class TestC{

	void meth(int i,int j)
	{
		i=i*2;
		j=j/2;
	}
	}

class CallByValue {

	public static void main(String[] args) {
		
		TestC ob=new TestC();
		
		int a=10,b=20;
		
		System.out.println("a and b before call : "+a+"  "+b);
		
		ob.meth(a,b);
		
		System.out.println("a and b after call : "+a+"  "+b);
	}

}
