package service;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

import entity.School;

public class SchoolService {
	
	public void printSchoolDetail() {
		
	Scanner sc = new Scanner(System.in);

		System.out.println("Welcome To Hospital");
		System.out.println("Please select following option");
		System.out.println("1.get All School  Detail");
		System.out.println("2.get teacher name by school name");
		
	int input = sc.nextInt();
	System.out.println("you have selected option : " + input);
	
	    if (input == 1) {
	    	getFirstSchoolDetails();
	        } 
	        else if (input == 2) {
	            sc.nextLine(); 
	            System.out.println("Enter school name:");
	            String schoolName = sc.nextLine();
	            getTeachersBySchoolName(schoolName);
	        }
	        else {
	            System.out.println("Invalid option selected. Please choose 1 or 2.");
	        }
	        
	        sc.close();
	    }

	private void getTeachersBySchoolName(String schoolName) {
		if(teacherNamecontainkey(schoolName))
		{
			
		}
		System.out.println("enter your teacher name:");
		
		
		
		
		
		
		
		
	}

	    
}