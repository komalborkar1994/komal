package repository;

import java.util.Scanner;

import entity.Demo;


public class SchoolRepository {
	

	public static Demo getSchoolDetail1() {
	Demo demo=new Demo ();
   demo.setId(1);
   demo.setSchoolName("Gurukul Engish School");
   demo.setPrincipalName("Ravidra patil");
   return demo;
	}
	public static Demo getSchoolDetail2() {
		Demo demo1=new Demo ();
	   demo1.setId(2);
	   demo1.setSchoolName("shivaji English School");
	   demo1.setPrincipalName("Rajaram Dhone");
	   
return demo1;
	}
}

	
	
	

	