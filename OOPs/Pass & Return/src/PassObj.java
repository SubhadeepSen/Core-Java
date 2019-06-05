class Test{
	int a,b;
	
	Test(int i,int j)
	{
		a=i;
		b=j;
	}
	
	boolean equals(Test O){
		if(O.a==a && O.b==b)
			return true;
		else
			return false;
	}
}


class PassObj {

	public static void main(String[] args) {
		
		Test Ob1=new Test(100,22);
		Test Ob2=new Test(100,22);
		Test Ob3=new Test(2,-1);
		
		System.out.println("Ob1==Ob2 : "+Ob1.equals(Ob2));
		System.out.println("Ob1==Ob3 : "+Ob1.equals(Ob3));
		System.out.println("Ob2==Ob2 : "+Ob2.equals(Ob3));
		
	}

}
