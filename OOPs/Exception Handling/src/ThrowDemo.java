
class ThrowDemo {
	static void proc(){
		try{
			throw new NullPointerException("demo");
		}catch(NullPointerException e){
			System.out.println("Caught inside proc");
			throw e;
		}
	}
	public static void main(String[] args) {
		
		try{
			proc();
		}catch(NullPointerException e){
			System.out.println("Recaught : "+e);
		}

	}

}
