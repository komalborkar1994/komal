package hasA;

public class Demo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("komal");
		student.setId(101);
		student.setCityname("pune");

		PersonalDetails personalDetails = new PersonalDetails();

		personalDetails.setFathername("suresh");
		personalDetails.setMothername("lata");

		student.setDetails(personalDetails);

		System.out.println(student.toString());
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getCityname());
		
		

		System.out.println(student.getDetails().getFathername());
		System.out.println(student.getDetails().getMothername());

	}

}
