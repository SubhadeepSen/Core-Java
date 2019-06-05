
class MultipleCatch {

	public static void main(String[] args) {
		try{
			int a=args.length;
			System.out.println("a = "+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}catch(ArithmeticException e){
			System.out.println("Divisio-by-zero"+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index OOB........"+e);
		}
		System.out.println("After try/catch blocks......");

	}

}
