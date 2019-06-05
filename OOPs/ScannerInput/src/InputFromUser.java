import java.util.Scanner;
class InputFromUser {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String s=in.nextLine();
		
		System.out.println("Enter an integer : ");
		int n=in.nextInt();
		
		System.out.println("Enter a float : ");
		float f=in.nextFloat();
			
		System.out.println("\n\nYou have enter : \n");
		
		System.out.println("Integer : "+n+"\nFloat : "+f+"\nString : "+s+"");
		

	}

}
