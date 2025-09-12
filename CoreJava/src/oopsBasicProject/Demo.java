package oopsBasicProject;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("Select class to print method:");
		System.out.println("1:addition of the no:");
		System.out.println("2:Enter the Substation of the no:");
		System.out.println("3:Enter the Multiplication of the no:");
		System.out.println("4:Enter the division of the no:");
		
		int input=sc.nextInt();
		switch (input) {
		case 1: {
			Caladdition cal;
			cal=new Caladdition();
			System.out.println("enter numbers :");
			int input1=sc.nextInt();
			int input2=sc.nextInt();
			 cal.addition(input1, input2, input);
		   break;
		}
		case 2:{
			CalSubstation cal;
			cal=new CalSubstation();
			System.out.println("enter numbers :");
			int input1=sc.nextInt();
			int input2=sc.nextInt();
			 cal.Substation(input1, input2, input);
		   break;
			
		}
		
		case 3:{
			Calmultiplication cal;
			cal=new Calmultiplication();
			System.out.println("enter numbers :");
			int input1=sc.nextInt();
			int input2=sc.nextInt();
			 cal.Multiplication(input1, input2, input);
		   break;
			
		}

			default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
	}

}
