
public class StringObj {

	public static void main(String[] args) {
		char c[]={'j','a','v','a'};
		
		String s=new String(c);
		String k=new String(c,1,2);
		
		String s1=new String(s);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(k);

	}

}
