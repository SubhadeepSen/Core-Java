package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*This is simple multi-threaded HTTP server. For every incoming client request one thread will be created.
 *Hence simultaneously N number of clients can communicate with this server.*/

public class MultiThreadedSimpleServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9090);
			boolean stop = false;
			while (!stop) {
				System.out.println("Waiting for client ...");
				Socket clientSocket = serverSocket.accept();
				System.out.println("Connected!");
				ClientThread clientThread = new ClientThread(clientSocket);
				clientThread.start();
			}
			serverSocket.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
