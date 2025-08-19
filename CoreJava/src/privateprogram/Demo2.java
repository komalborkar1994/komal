package privateprogram;

public class Demo2 {
	private String name = "komal";
	private int age;
	private String deparment;

	private void printMethod() {
		age = 29;
		deparment = "computer";
		System.out.println("Age:" + age);
		System.out.println("Deparment:" + deparment);

	}

	public void getDetail() {
		System.out.println(name);

		printMethod();
		

	}

}
