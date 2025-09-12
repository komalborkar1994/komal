package Array;

public class Demo1 {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Komal");
		employee.setCity("nashik");
		employee.setId(101);
		employee.setSalary(12000.32f);

		Employee employee1 = new Employee();
		employee1.setName("Nisha");
		employee1.setCity("pune");
		employee1.setId(102);
		employee1.setSalary(12450.32f);

		Employee employee2 = new Employee();
		employee2.setName("Ram");
		employee2.setCity("mumbai");
		employee2.setId(103);
		employee2.setSalary(12890.32f);

		Employee[] employeesArray = { employee, employee1, employee2 };
		System.out.println(employeesArray[0]);
		System.out.println(employeesArray[1]);
		System.out.println(employeesArray[2]);
		
		
//		System.out.println(employee);
//		System.out.println(employee1);
//		System.out.println(employee2);

//		System.out.println(employeesArray[i].getName());
//		System.out.println(employeesArray[i].getCity());
//		System.out.println(employeesArray[i].getId());
//		System.out.println(employeesArray[i].getSalary();
//		for(int i=0;i<employeesArray.length;i++)
//		{
//			System.out.println(employeesArray[i]);
//		}

	}

}
