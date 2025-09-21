package abstaction;

public  abstract class Vehicle {
	
	
	int noOfTyres;
	
	public void displayTyres()
	{
		System.out.println("this vehicle has:"+noOfTyres+"tyres.");
	}
	public abstract void start();
	
}
