package com.kk.controllers;

public class SwappingThreeNo {
	public static void main(String[] args) {
		int no1=20;
		int no2=30;
		System.out.println("before swapping no:no1="+no1+",no2="+no2);
		
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("after swapping no: no1="+no1+",no2="+no2);
		
	}

}
