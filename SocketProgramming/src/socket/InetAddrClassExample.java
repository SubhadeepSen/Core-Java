package socket;

import java.io.IOException;
import java.net.InetAddress;

/*The InetAddress class is an encapsulation on IP address and hostname. 
 *It is widely used by other networking classes in java, URL, Socket etc.
 *This class does not provide any constructor, so you will have to use one 
 *of the factory method to get the object.*/

public class InetAddrClassExample {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
		
		/*InetAddress address2 = InetAddress.getByName("www.google.com");
		System.out.println(address2.getHostAddress());
		System.out.println(address2.getHostName());*/
		
		//Socket socket = new Socket(address, 8080);
	}
}
