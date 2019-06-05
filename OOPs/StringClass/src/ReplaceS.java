
public class ReplaceS {

	public static void main(String[] args) {
		String org="It is a test.This is too.";
		String search="is";
		String sub="was";
		String res=" ";
		
		int i;
		do{
			System.out.println(org);
			i=org.indexOf(search);
			if(i!=-1){
				res=org.substring(0,i);
				res=res+sub;
				res=res+org.substring(i+search.length());
				org=res;
			}
		}while(i!=-1);

	}

}
