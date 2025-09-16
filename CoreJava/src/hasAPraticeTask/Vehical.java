package hasAPraticeTask;

public class Vehical {
	private String name;
	
	private String vehicalType;
	
	private Registeration detail;
	

	public Registeration getDetail() {
		return detail;
	}

	public void setDetail(Registeration detail) {
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	@Override
	public String toString() {
		return "Vehical [name=" + name + ", vehicalType=" + vehicalType + ", detail=" + detail + "]";
	}
	

	
	
	
	

}
