package staticprogram;

public class Demo1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.getCityName();
		System.out.println(Student.name);
		System.out.println(Student.collegeName);
		Student.getDetail();

	}

}
