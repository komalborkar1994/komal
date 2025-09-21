package encapsulation;

public class Demo {
	
	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setName("komal");
		student .setId(101);
		student.setDeparment("BCA");
		
		 System.out.println(student.getName());
		  System.out.println(student.getId());
		 System.out.println(student.getDeparment());
	
	}
	
	

}
