package hasAPraticeTask;

import hasA.PersonalDetails;

public class Demo3 {
	public static void main(String[] args) {
		
		Student1 student1=new Student1();
		
		student1.setId(104);
		student1.setName("Riyu");
		student1.setRollno(1100);
		
		Vehical vehical=new Vehical();
		vehical.setName("Nexon");
		vehical.setVehicalType("car");

		Registeration registeration=new Registeration();
		registeration.setVehicalno(4545);
		registeration.setYearofManufacture(2024);
		
		student1.setV(vehical);
		vehical.setDetail(registeration);
		
		
	
		
		
		
		
		
		System.out.println(student1.toString());
		System.out.println(vehical.toString());
		
		System.out.println(student1.getName());
		System.out.println(student1.getId());
		System.out.println(student1.getRollno());
		
		
		System.out.println(student1.getV().getName());
		System.out.println(student1.getV().getVehicalType());
		
		
		System.out.println(vehical.getDetail().getVehicalno());
		System.out.println(vehical.getDetail().getYearofManufacture());
		
		
		
		
		
		
		
}
}
