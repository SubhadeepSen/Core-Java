package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/*This is an example to create socket client. 
 *Make sure your server is running prior to running this client application.*/

public class SocketClientExample {
	public static void main(String[] args) {
		try {
			InetAddress serverAddress = InetAddress.getByName("localhost");
			System.out.println("IP: " + serverAddress.getHostAddress());
			Socket client = new Socket(serverAddress, 9090);
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println(in.readLine());
			out.println("Hello Server!");
			in.close();
			out.close();
			client.close();
		} catch (IOException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}
}
