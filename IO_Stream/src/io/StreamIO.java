package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class StreamIO {
	public static void main(String[] args) {
		
	}

	/*
	 * File input and output streams are used to read and write data from and into a
	 * file as stream of data [byte]
	 */
	private static void fileInputStreamExample() {
		try {
			FileInputStream file = new FileInputStream("test.txt");
			int data = file.read();
			while (data != -1) {
				System.out.print((char) data);
				data = file.read();
			}
			file.close();
		} catch (Exception e) {
			System.out.println("file not found");
		}
	}

	private static void fileOutputStreamExample() {
		try {
			FileOutputStream output = new FileOutputStream("test2.txt");
			String data = "hello output stream!";
			output.write(data.getBytes());
			output.close();
		} catch (Exception e) {
			System.out.println("file not found");
		}
	}

	/*
	 * Data input and Output stream are used to read and write primitive data from
	 * and into a file as stream of data
	 */
	private static void dataInputOutputStreamExample() {
		File file = new File("dataOutputStream.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Unable to create file!");
			}
		}

		try {
			DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(file.getName()));
			dataOutput.writeInt(123);
			dataOutput.writeDouble(457.123);
			dataOutput.writeFloat(45.15f);
			dataOutput.writeInt(45646);
			dataOutput.close();

			DataInputStream dataInput = new DataInputStream(new FileInputStream(file.getName()));
			System.out.println("Integer: " + dataInput.readInt());
			System.out.println("Double: " + dataInput.readDouble());
			System.out.println("Float: " + dataInput.readFloat());
			System.out.println("Integer: " + dataInput.readInt());
			dataInput.close();
		} catch (IOException e) {

		}
	}

	/*
	 * OutputStreamWriter and InputStreamReader are used to directly write and read
	 * character to and from file. Used in network communication
	 */
	private static void inputOutputStreamReaderWriterExample() {
		try {
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("stream.txt"));
			InputStreamReader in = new InputStreamReader(new FileInputStream("stream.txt"));

			// writes the data into a buffer, hence you need to flush it to write into file
			out.write("hello! welcome to java stream");
			// out.flush();

			/*
			 * but if you are closing the stream then it automatically flushes the buffer
			 * into file
			 */
			out.close();

			int data = in.read();
			while (data != -1) {
				System.out.print((char) data);
				data = in.read();
			}
			in.close();

		} catch (IOException e) {
			System.out.println("Unable to create file!");
		}
	}

	/*
	 * Buffered reader and writer are used to read and write line of data (String)
	 * at a time
	 */
	private static void bufferedReaderWriterExample() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("bufferReader.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("bufferWriter.txt"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
			// writer.flush();

			reader.close();
			writer.close();

		} catch (IOException e) {
			System.out.println("Something wrong!");
		}
	}

	// The printstream class coverts primitive to string and write them into file.
	// System.out.println uses this class
	private static void printStreamExample() {
		try {
			PrintStream out = new PrintStream("printStream.txt");
			int var = 1564;
			out.print("the value of var is " + var);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
	}
	
	/*System.in is used to read data from console*/
	private static void systemIn() {
		InputStreamReader in = new InputStreamReader(System.in);
		System.out.println("Enter your name: ");
		BufferedReader reader = new BufferedReader(in);
		try {
			System.out.println("You have entered: " + reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
