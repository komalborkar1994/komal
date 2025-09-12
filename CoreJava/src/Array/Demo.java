package Array;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.setName("komal");
		s.setId(101);
		s.setAge(27);
		s.setCity("pune");
//		System.out.println("---------------------");
		
		Student s1=new Student();
		s1.setName("gattya");
		s1.setId(102);
		s1.setAge(14);
		s1.setCity("Mumbai");
//		System.out.println("----------------------");
		
		Student s2=new Student();
		s2.setName("komal");
		s2.setId(103);
		s2.setAge(23);
		s2.setCity("washim");
//		System.out.println("---------------------------");
		
		Student s4=new Student();
		s4.setName("riyu");
		s4.setId(104);
		s4.setAge(18);
		s4.setCity("delhi");
//		System.out.println("----------------------------");
		
		Student[]studentArray= {s,s1,s2,s4};
		
		Scanner sc =new Scanner(System.in);
		
//		System.out.println("enter city");
		
//		String city =sc.next();
		
	System.out.println("enter age :");
	int age=sc.nextInt();
	
		for(int i=0;i<studentArray.length;i++)
		{
//	Student studentfArray		=studentArray[i];
//			System.out.println(studentArray[i]);
			
//	if(studentArray[i].getCity().equals(city)) { 
//		System.out.println(studentArray[i]);
		
//	System.out.println(studentArray[i].getName());
//	System.out.println(studentArray[i].getAge());
//	System.out.println(studentArray[i].getCity());
//	System.out.println(studentArray[i].getId());
	  
//	
//	
//	
//		}}
		if(studentArray[i].getAge()>=18) {
				System.out.println(studentArray[i]);
		
		
	}
		
		
		
		
		
	}
		}
	}
	

		
