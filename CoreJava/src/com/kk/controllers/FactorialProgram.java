package com.kk.controllers;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class FactorialProgram {
	public static void main(String[] args) {
		
	
	int no=6;
	if(no<0) {
		System.out.println("it is not define for negetive no");
	}
	else {
		long fact=1;
	
	for( int i=1;i<=no;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);

	}
	}
	}		
	


