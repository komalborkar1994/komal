package com.kk.controllers;

public class PalindromNo {
	public static void main(String[] args) {
		int no = 12321;
		int reverseno = 0;
		int originalno = no;

		while (no != 0) {
			int digit = no % 10;
			reverseno = reverseno * 10 + digit;
			no = no / 10;
		}
		if (originalno == reverseno) {
			System.out.println("palindrom no");
		} else {
			{
				System.out.println("not palindrom no");
			}
		}

	}

}
