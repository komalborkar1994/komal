package constructors;

public class Employee {
	String name;
	int age;
	String education;
	int empid;
	public Employee(String name,String education,int age,int empid)
	{
		this.age=age;
		this.education=education;
		this.empid=empid;
		this.name=name;
		
	}
	public void getDeatil() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Education:"+education);
		System.out.println("Empid:"+empid);
		
		
		
	}
	public static void main(String[] args) {
		Employee employee=new Employee("gattya","B.E",24, 102);
		employee.getDeatil();
		
	}
	}
	
	

