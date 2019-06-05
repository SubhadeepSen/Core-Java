
public class CharAt {

	public static void main(String[] args) {
		
		String p="Subhadeep";
		
		int start=3,end=7;
		
		char buf[]=new char[end-start];
		
		p.getChars(start, end, buf, 0);
		
		System.out.println(buf);
		

	}

}
