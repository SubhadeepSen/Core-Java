package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*This architecture follows the HTTP model, after every request-response the connection will be closed. 
 *The client will have to send a new request to connect.
 *Here the server can be explicitly closes by setting the stop boolean variable to true.
 *Note: It allows multiple connections one by one, not at the same time as it is not a multi-threaded server.
 *Check MultiThreadedSimpleServer*/

public class MultiUserSimpleServer {
	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9090);
			boolean stop = false;
			while (!stop) {
				System.out.println("waiting for client...");
				Socket socket = server.accept();
				System.out.println("Connected!");
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println("Hello client!");
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = in.readLine();
				System.out.println(line);
				in.close();
				out.close();
				socket.close();
			}
			server.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
