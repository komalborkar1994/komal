package hasAPraticeTask;

public class Demo2 {
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("komal");
		employee.setId(103);
		employee.setCityName("Mumbai");
		
		Experience experience=new Experience();
		experience.setCompanyName("infosys");
		experience.setYear(4);
		
		employee.setExperience(experience);
		System.out.println(employee.toString());
		System.out.println(employee.getName());
		System.out.println(employee.getId());
		
		System.out.println(employee.getExperience().getCompanyName());
		System.out.println(employee.getExperience().getYear());
		
		
	}

}
