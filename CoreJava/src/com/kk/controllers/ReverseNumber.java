package com.kk.controllers;

public class ReverseNumber {
	public static void main(String[] args) {
		int number=123434;
		int reverseno=0;
		while(number!=0) {
			int remainder=number%10;
			reverseno=reverseno*10+remainder;
			number=number/10;
		}
		System.out.println("reversenumber:"+reverseno);
	}

}
