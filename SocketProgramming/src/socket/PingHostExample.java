package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class PingHostExample {

	public static void main(String[] args) throws IOException {
		String hostAddress = "www.google.com";
		InetAddress host = InetAddress.getByName(hostAddress);
		System.out.println(host.isReachable(1000)); // This method sometime works, sometime not.

		// Another way to execute ping command in command prompt, get the output and
		// display in the console using java
		Process process = Runtime.getRuntime().exec("ping " + hostAddress);
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String commandLineOutput = "";
		boolean isReachable = true;
		while((commandLineOutput = in.readLine()) != null) {
			System.out.println(commandLineOutput);
			if(commandLineOutput.contains("unreachable")) {
				isReachable = false;
			}
		}
		
		if(isReachable)
			System.out.println("Host is reachable");
		else
			System.out.println("Host is unreachable");
	}

}
