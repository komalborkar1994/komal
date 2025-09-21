package abstaction;

public class Main {
	public static void main(String[] args) {
		
		Vehicle vehicle=new Car() ;
		
		vehicle.displayTyres();
		vehicle.start();
		
		System.out.println();
		
		
		Vehicle vehicle2=new Scooter() ;
		vehicle2.displayTyres();
		vehicle2.start();
		
	}
}

