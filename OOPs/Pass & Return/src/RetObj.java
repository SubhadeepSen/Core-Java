class TestR{

	int a;
	
	TestR(int i){
		a=i;
	}
	
	TestR ByTen(){
		
		TestR temp=new TestR(a+10);
		return temp;
	}
	}

class RetObj {

	public static void main(String[] args) {
		
		TestR ob1=new TestR(2);
		
		TestR ob2;
		
		ob2=ob1.ByTen();
		
		System.out.println("ob1.a : "+ob1.a);
		System.out.println("ob2.a : "+ob2.a);
		
		ob2=ob2.ByTen();
		
		System.out.println("ob2.a after second increase : "+ob2.a);
	}

}
