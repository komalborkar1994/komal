package polymorphism;

public class Demo1 {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.PrintName();
		employee.getSalary();
		
		Developer developer=new Developer();
		developer.PrintName();
		developer.getid();
		
	}

}
