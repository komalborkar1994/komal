package com.kk.controllers;

public class HclOfTwoNo {
	public static void main(String[] args) {
		int no1=12;
		int no2=15;
		int hcf=1;
		for(int i=1;i<=no1&& i<=no2;i++) {
			if(no1%i==0 && no2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("hcf:"+hcf);
	}
	

}
