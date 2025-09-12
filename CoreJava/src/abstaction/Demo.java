package abstaction;

public class Demo {
	public static void main(String[] args) {
		
		String value ="HR";
		
		Employee employee;
		
		if(value.equalsIgnoreCase("HR")) {
			
			employee=new HR();
			employee.printSalary();
		}
		else 
			{
				employee=new Maneger();
				employee.printSalary();
			}
		}
		
	}


