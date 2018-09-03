package socket;

import java.io.IOException;
import java.net.ServerSocket;

/*The server socket class is used create a socket and the constructor accept port number. It tries to bind with 
the provided port number. Upon unsuccessful binding throws IOException. So if it is unable to bind with a port
that means the port is open. The port number ranges from 0 to 65535.*/

public class PortScanner {
	public static void main(String[] args) {
		int port = 1;
		while (port <= 65535) {
			try {
				ServerSocket server = new ServerSocket(port);
				server.close();
			} catch (IOException e) {
				System.out.println("The port is open: " + port);
			}
			port++;
		}
	}
}
