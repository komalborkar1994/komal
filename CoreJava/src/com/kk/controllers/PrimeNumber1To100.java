package com.kk.controllers;

public class PrimeNumber1To100 {

	public static void main(String[] args) {
			
		 System.out.println("it is not prime no");
				for(int no=2;no<=100;no++)
				{
			boolean isprime = true;
			for (int i = 2; i < no / 2; i++) {
				if (no % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				System.out.println(no);
			} else {
	}

}
}}