package Array;

public class Employee {
	private String name;
	private String city;
	private int id;
	private float salary;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", id=" + id + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
