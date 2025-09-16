package hasAPraticeTask;

public class Registeration {
	private int vehicalno;
	private int yearofManufacture;
	
	
	public int getVehicalno() {
		return vehicalno;
	}
	public void setVehicalno(int i) {
		this.vehicalno = i;
	}
	public int getYearofManufacture() {
		return yearofManufacture;
	}
	public void setYearofManufacture(int yearofManufacture) {
		this.yearofManufacture = yearofManufacture;
	}
	@Override
	public String toString() {
		return "Registeration [vehicalno=" + vehicalno + ", yearofManufacture=" + yearofManufacture + "]";
	}
	
	

}
