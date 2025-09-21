package inheritanceprogram;

public class Tiger extends Animal1{
	
	public void printColour()
	{
		System.out.println("yellow");
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		super.printName();
		System.out.println("tiger name of animal");
	}
	

}
