package service;

import java.security.PublicKey;
import java.util.Scanner;

import entity.Doctor;
import repository.Doctorrepository;

public class DoctorService {

	public void printDentistDetail() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome To Hospital");
		System.out.println("Please select following option");
		System.out.println("1.get All Doctor Detail");
		System.out.println("2.get doctor By id");
		
		int input = sc.nextInt();
		System.out.println("you have selected option : " + input);

		switch (input) {
		case 1: {
			System.out.println(Doctorrepository.getDentistDeatil());
			System.out.println(Doctorrepository.getCardiologistDeatil());
			break;

		}
		case 2: {
			System.out.println("Enter your id:");
			int id1 = sc.nextInt();

			System.out.println(" your enter id:" + id1);
			if (id1 == 101) {
				System.out.println(Doctorrepository.getDentistDeatil());

			} else if (id1 == 102) {
				System.out.println(Doctorrepository.getCardiologistDeatil());

			} else {
				System.out.println("exit");
			}

			break;

		}

		default:
			break;
		}

	}

//		Doctor doctor=Doctorrepository.getDentistDeatil();
//		System.out.println(doctor.getHospitalName());
//		System.out.println(doctor.getHospitalAddress());
//		System.out.println(doctor.getDoctorName());
//		System.out.println(doctor.getDoctorid());
//		System.out.println(doctor.getDoctorspecilization());
//		System.out.println(doctor.getDoctorContactNO());
//		System.out.println(doctor.getDoctorRegNo());
//		System.out.println("-----------------------------");
//		}
//		
//	public void printCardiologistDetail()
//	{
//	    Doctor doctor=Doctorrepository.getCardiologistDeatil();
//		System.out.println(doctor.getHospitalName());
//		System.out.println(doctor.getHospitalAddress());
//		System.out.println(doctor.getDoctorName());
//		System.out.println(doctor.getDoctorid());
//		System.out.println(doctor.getDoctorspecilization());
//		System.out.println(doctor.getDoctorContactNO());
//		System.out.println(doctor.getDoctorRegNo());
//		System.out.println("------------------------------------");
//		
//	}
//	

}
