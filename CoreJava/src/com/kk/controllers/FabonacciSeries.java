package com.kk.controllers;

public class FabonacciSeries {
	public static void main(String[] args) {
		int n=10;
	    int no1=0;
	    int no2=1;
	System.out.println("fabonacciseries:"+no1+","+no2);
	for(int i=2;i<n;i++) {
		int sum=no1+no2;
		System.out.println(sum);
		no1=no2;
		no2=sum;
	}
	}

}
