package com.kk.controllers;

public class CalculatorSwitchCase {
	public static void main(String[] args) {
		double no1 = 10;
		double no2 = 20;
		String operator = "*";
		double result;
		switch (operator) {
		case "+":
			result = no1 + no2;
			System.out.println("result:" + result);
			break;

		case "-":

			result = no1 - no2;
			System.out.println("result:" + result);
			break;
		case "/":
			result = no1 / no2;
			System.out.println("result:" + result);
			break;
		case "*":
			result = no1 * no2;
			System.out.println("result:" + result);
			break;

		default:
			System.out.println("invalid operator");
		}

	}

}
