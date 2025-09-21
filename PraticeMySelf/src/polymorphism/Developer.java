package polymorphism;

public class Developer extends Employee {
	
	
	
	public Developer()
	{
		System.out.println("in Development constuctor");
	}

	@Override
	public void PrintName() {
		
		super.PrintName();
		System.out.println("Developername: komal");
	}
     public void getid()
     {
    	 System.out.println("101");
     }
	

	
	
	

}
