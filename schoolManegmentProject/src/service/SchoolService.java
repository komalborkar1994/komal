package service;

import java.util.Scanner;

import repository.SchoolRepository;

public class SchoolService {
	
		public void selectOptions() {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Welcome to IPL portal ");
				System.out.println("Please select following options - ");
				System.out.println("1. Get All School Details");
				System.out.println("2. Get School details by  Name");
				System.out.println("3. Get School details by School id");
				int input = sc.nextInt();
				System.err.println("You have selected option : " + input);

				switch (input) {
				
				case 1: {
					System.out.println(SchoolRepository.getSchoolDetail1());
					System.out.println(SchoolRepository.getSchool2Detail());
					
				break;
				}
				
				case 2: {
					System.out.println("Please enter your school id : ");
					int id=sc.nextInt();
					System.err.println("entered School id is  : " + id);
					getSchoolDetail1(id);
					break;
				}
				
				}
		
		
				