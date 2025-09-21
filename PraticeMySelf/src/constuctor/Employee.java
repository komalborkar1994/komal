package constuctor;

public class Employee {
	String name;
	int age;
	int id;

	public Employee()
	{
		System.out.println("in Employee constuctor:");
	}
	public Employee(String name,int age,int id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public void getDetail()
	{
		System.out.println("Employee name:"+name + " ,Employee age:"+age + ",Employee id:"+id); 
	}
	public static void main(String[] args) {
		Employee employee=new Employee("gattya",23,101);
		employee.getDetail();
	}
	
		}
