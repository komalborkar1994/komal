package abstactiontask;

public abstract class Employee {
	
	double salary1;
    public Employee (double salary)  {
	
	{
        this.salary1 = salary;}
    }
    // Abstract method to deduct salary and print
    abstract void deductAndPrint();
	

}
