package entity;

public class Demo {
	
	private String schoolName;
	private String principalName;
	private int id ;
	
	

	@Override
	public String toString() {
		return "Demo [schoolName=" + schoolName + ", principalName=" + principalName + ", id=" + id + "]";
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	}
