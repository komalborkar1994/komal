package constructors;

public class Student {
	String name;
	String deparment;
	int age;
	public Student(String name,String deparment,int age)
	{
		this.name=name;
		this.deparment=deparment;
		this.age=age;
	}
	public void getStudentDetail()
	{
		System.out.println("name:"+name);
		System.out.println("deparment:"+deparment);
		System.out.println("age:"+age);
		
	}
	public static void main(String[] args) {
		Student student=new Student("komal", "BCA", 26);
		student.getStudentDetail();
		
	}

}
