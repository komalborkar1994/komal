package hasAPraticeTask;

public class Experience {
	private String companyName;
	private int year;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Experience [companyName=" + companyName + ", year=" + year + "]";
	}
	
	
	
	
	

}
