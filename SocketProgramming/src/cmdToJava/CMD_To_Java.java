package cmdToJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMD_To_Java {

	public static void main(String[] args) throws IOException {
		Process process = Runtime.getRuntime().exec("javac");
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String cmdOutput = "";
		while((cmdOutput = in.readLine()) != null) {
			System.out.println(cmdOutput);
		}
	}
}
