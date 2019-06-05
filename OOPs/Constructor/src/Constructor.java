
public class Constructor {

		Constructor()
		{
		System.out.println("Default constructor.....No value is passed");
		}
		Constructor(int x)
		{
		System.out.println("\n\nparameterized constructor  : passed value is : "+x);
		}
		public static void main(String[] args)
		{
		new Constructor();
		new Constructor(100);
		}

	}


