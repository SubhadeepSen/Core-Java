package main;

import functionalInterfaces.OneArgMethodInterface;

public class OneArgLambdaExpression {

	public static void main(String[] args) {

		OneArgMethodInterface oami = (String name) -> {
			String surName = "Einstein";
			System.out.println(name + " " + surName);
		};
		
		oami.display("Albert");
	}
}
