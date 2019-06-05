class Overload{
	
	void Test(){
		System.out.println("No Parameters..........");
	}
	
	void Test(int a){
		System.out.println("a : "+a);
	}
	
	void Test(int a, int b){
		System.out.println("a and b : "+a+" "+b);
	}
	
	double Test(double a){
		System.out.println("double a : "+a);
		return a*a;
	}
}



class OverloadC {

	public static void main(String[] args) {
		
		Overload ob=new Overload();
		double result;
		ob.Test();
		ob.Test(10);
		ob.Test(10,20);
		result=ob.Test(165.23);
		System.out.println("Result of ob.Test(165.23) is : "+result);
	}

}
