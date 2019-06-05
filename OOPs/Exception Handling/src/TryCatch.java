class TryCatch {

	public static void main(String[] args) {
		try{
			int d,a;
			d=0;
			a=42/d;
			System.out.println("This will not be printed.....");
		}catch(ArithmeticException e){
			System.out.println("Division-by-zero.");
		}
		
		System.out.println("After catch statement.....");
	}

}
