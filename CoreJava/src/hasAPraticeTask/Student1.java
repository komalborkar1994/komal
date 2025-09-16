package hasAPraticeTask;

public class Student1 {
	private String name;
	private int id;
	private int rollno;
	
	
	private Vehical v;
	
	
	
	public Vehical getV() {
		return v;
	}
	public void setV(Vehical v) {
		this.v = v;
	}
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", rollno=" + rollno + ", v=" + v + "]";
	}
	
	
	
	

}
