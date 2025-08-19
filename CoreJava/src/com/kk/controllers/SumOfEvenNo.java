package com.kk.controllers;

public class SumOfEvenNo {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=150;i++) {
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
