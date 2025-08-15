package repository;

import entity.Doctor;

public class Doctorrepository {

	
	public static Doctor getDentistDeatil()
	{
		Doctor doctor=new Doctor();
		doctor.setHospitalName("City Hospital");
		doctor.setHospitalAddress("pune");
		doctor.setDoctorName("Aniket");
		doctor.setDoctorspecilization("dentist");
		doctor.setDoctorContactNO(1234564523l);
		doctor.setDoctorid(101);
		doctor.setDoctorRegNo("A1");
		return doctor;
	}
	
	public static Doctor getCardiologistDeatil()
	{
		Doctor doctor=new Doctor();
		doctor.setHospitalName("City Hospital");
		doctor.setHospitalAddress("Pune");
		doctor.setDoctorName("Rahul");
		doctor.setDoctorspecilization("cardiologist");
		doctor.setDoctorContactNO(121232343);
		doctor.setDoctorid(102);
		doctor.setDoctorRegNo("A2");
		return doctor;
	}
		
		
	}
	


