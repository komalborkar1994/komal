package com.kk.controllers;

public class PrimeNumber {
	public static void main(String[] args) {
		int no = 23;
		if (no <= 1) {
			System.out.println("it is not prime no");
			return;
		}
		boolean isprime = true;
		for (int i = 2; i < no / 2; i++) {
			if (no % i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println(no + "prime no");
		} else {
			{
				System.out.println(no + "not prime no");
			}

		}

	}
}
