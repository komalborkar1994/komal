package com.kk.controllers;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no=1234;
		int originalnumber=no;
		int sum=0;
		
		int temp=no;
		int digit=0;
		while(temp!=0)
		{
			digit++;
			temp=temp/100;
		}
		while(no!=0)
		{
			int rem=no%10;
			int mul=1;
			for(int i=0;i<digit;i++)
			{
				mul=mul*mul;
			}
			sum=sum+mul;
			no=no/10;
		}
		if(sum==originalnumber)
		{
			System.out.println("Armstrong number:"+originalnumber);
			
		}
		else {
			{
				System.out.println("Armstrong number:"+originalnumber);
		}
			}
			
		}
	}


