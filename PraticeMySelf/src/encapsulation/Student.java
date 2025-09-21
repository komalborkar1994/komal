package encapsulation;

public class Student {
	private String name;
	private int id;
	private String deparment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", deparment=" + deparment + "]";
	}
	
	

}
