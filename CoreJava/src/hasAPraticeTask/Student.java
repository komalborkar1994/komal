package hasAPraticeTask;

public class Student {
	private String name;
	private int id;
	private String cityname;
	
	private Degree degree;
	
	
	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
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

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", cityname=" + cityname + ", degree=" + degree + "]";
	}
	
	
	
	

}
