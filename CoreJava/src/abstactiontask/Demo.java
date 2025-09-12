package abstactiontask;

import java.util.Scanner;

public class Demo {
	


	public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter Manager salary: ");
	        
	        double managerSalary = scanner.nextDouble();
	        
	        System.out.print("Enter HR salary: ");
	        double hrSalary = scanner.nextDouble();
	        
	        Maneger manager = new Maneger(managerSalary);
	        HR hr = new HR(hrSalary);
	        
	        manager.deductAndPrint();
	        hr.deductAndPrint();
	        }
	}
		

			
		




	
