package hasAPraticeTask;

public class Demo {
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("komal");
		student.setId(102);
		student.setCityname("washim");
		
		Degree degree=new Degree();
		degree.setDegree("msc");
		degree.setUnivercity("Amaravati univercity");
		
		student.setDegree(degree);
		System.out.println(student.toString());
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getCityname());
		System.out.println(student.getDegree().getDegree());
		System.out.println(student.getDegree().getUnivercity());
		
		
		
	}
		
		
	

}
