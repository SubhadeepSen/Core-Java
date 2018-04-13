package stringJoinerClass;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		System.out.println("Empty: " + sj);
		sj.add("Rohan");
		sj.add("John");
		sj.add("Juli");
		System.out.println(sj);
		
		StringJoiner sj2 = new StringJoiner("-", "[", "]");
		System.out.println("Empty: " + sj2);
		sj2.add("Rahul");
		sj2.add("Sunny");
		sj2.add("Gaurav");
		System.out.println(sj2);
		
		System.out.println("String: " + sj2.toString());
		
		StringJoiner sj3 = sj.merge(sj2);
		System.out.println("Merged: " + sj3);
		System.out.println("Length: " + sj3.length());
	}

}
