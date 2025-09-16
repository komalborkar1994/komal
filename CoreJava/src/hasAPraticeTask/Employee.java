package hasAPraticeTask;

public class Employee {
	
	private String name;
	private int id;
	private String cityName;
	
	private Experience experience;
	
	
	
	
	public Experience getExperience() {
		return experience;
	}
	public void setExperience(Experience experience) {
		this.experience = experience;
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
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", cityName=" + cityName + ", experience=" + experience + "]";
	}
	

}
