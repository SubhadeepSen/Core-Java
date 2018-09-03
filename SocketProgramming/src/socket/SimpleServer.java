package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*Note: This server accepts only one connection. Once you are done the server will stop listening which is a drawback.
 *Check MultiUserSimpleServer for this.*/

public class SimpleServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9090);
		System.out.println("waiting for client...");
		/*
		 * The server.accept() statement blocks the further execution and waits for a
		 * client to be connected. It also returns a socket object on successful
		 * connection.
		 */
		Socket socket = server.accept();
		System.out.println("Connected!"); // This line ensures that you are connected on the provided port

		/*
		 * Creates the printwriter object from the socket output stream which can be
		 * used to send data to client. The second argument enables auto flush.
		 */
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		out.println("Hello client!");

		/*
		 * Creates the buffered reader object from the socket input stream which can be
		 * used to read data from coming from the client
		 */
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = in.readLine();
		System.out.println(line);

		in.close();
		out.close();
		socket.close();
		server.close();
	}

}
