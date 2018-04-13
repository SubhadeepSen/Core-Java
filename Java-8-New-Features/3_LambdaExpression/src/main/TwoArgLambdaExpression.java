package main;

import functionalInterfaces.TwoArgMethodInterface;

public class TwoArgLambdaExpression {

	public static void main(String[] args) {

		TwoArgMethodInterface tami = (a, b) -> a + b;
		int result = tami.performMath(20, 10);
		System.out.println("ADD : " + result);
		
		tami = (a, b) -> a - b;
		result = tami.performMath(20, 10);
		System.out.println("SUB : " + result);
		
		tami = (a, b) -> a * b;
		result = tami.performMath(20, 10);
		System.out.println("MUL : " + result);
		
		tami = (a, b) -> a / b;
		result = tami.performMath(20, 10);
		System.out.println("DIV : " + result);
	}

}
