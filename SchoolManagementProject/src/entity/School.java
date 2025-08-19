package entity;

public class School {
	private String schoolName;
	private String principalname;
	private int totalclass;
	private int totalTeacher;
	private int totalStudent;
	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", principalname=" + principalname + ", totalclass=" + totalclass
				+ ", totalTeacher=" + totalTeacher + ", totalStudent=" + totalStudent + "]";
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getPrincipalname() {
		return principalname;
	}
	public void setPrincipalname(String principalname) {
		this.principalname = principalname;
	}
	public int getTotalclass() {
		return totalclass;
	}
	public void setTotalclass(int totalclass) {
		this.totalclass = totalclass;
	}
	public int getTotalTeacher() {
		return totalTeacher;
	}
	public void setTotalTeacher(int totalTeacher) {
		this.totalTeacher = totalTeacher;
	}
	public int getTotalStudent() {
		return totalStudent;
	}
	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}
	
	
	
	
	
		
	}


