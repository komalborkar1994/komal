package com.kk.controllers;

public class DigitCount {
	public static void main(String[] args) {
		int no = 1234675674;
		int count = 0;
		while (no != 0) 
		{
			no = no / 10;
			count++;
		}

		System.out.println("the no of digit is:" + count);

	}

}
