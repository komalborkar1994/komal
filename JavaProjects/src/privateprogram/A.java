package privateprogram;

public class A {
	public static void main(String[] args) {
		Doctor d = new Doctor();

		d.setDrdeparment("OPD");
		d.setDrname("nitin");
		d.setDreducation("MBBS");

		System.out.println(d.getDrdeparment());
		System.out.println(d.getDrname());
	    System.out.println(d.getDreducation());

	    
	    
		Patient p = new Patient();

		p.setName("komal");
		p.setDisease("Bp");
		System.out.println(p.getName());
		System.out.println(p.getDisease());

	}

}
