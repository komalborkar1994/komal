package repository;
	import entity.School;

	public class SchoolRepository {
		

		public static School getFirstSchoolDetails()
		{
			School school=new School();
		school.setSchoolName("Euro English School");
		school.setPrincipalname("naik sir");
		school.setTotalclass(7);
		school.setTotalStudent(40);
		school.setTotalTeacher(9);
		return school;
		}
		

		public static School getSecondSchoolDetails()
		{
			School school=new School();
		school.setSchoolName("Gurukul Smart School");
		school.setPrincipalname("naik sir");
		school.setTotalclass(10);
		school.setTotalStudent(60);
		school.setTotalTeacher(12);
		return school;
		}
	}

	


