package entity;

public class Doctor {
	private String hospitalName;
	private String hospitalAddress;
	private String doctorName;
	private int doctorid;
	private String doctorspecilization;
	private long doctorContactNO;
	private String doctorRegNo;
	
	public String getHospitalName() {
		return hospitalName;
	}
	
	
	@Override
	public String toString() {
		return "Doctor [hospitalName=" + hospitalName + ", hospitalAddress=" + hospitalAddress + ", doctorName="
				+ doctorName + ", doctorid=" + doctorid + ", doctorspecilization=" + doctorspecilization
				+ ", doctorContactNO=" + doctorContactNO + ", doctorRegNo=" + doctorRegNo + "]";
	}


	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorspecilization() {
		return doctorspecilization;
	}
	public void setDoctorspecilization(String doctorspecilization) {
		this.doctorspecilization = doctorspecilization;
	}
	public long getDoctorContactNO() {
		return doctorContactNO;
	}
	public void setDoctorContactNO(long doctorContactNO) {
		this.doctorContactNO = doctorContactNO;
	}
	public String getDoctorRegNo() {
		return doctorRegNo;
	}
	public void setDoctorRegNo(String doctorRegNo) {
		this.doctorRegNo = doctorRegNo;
	}
	
	

}
