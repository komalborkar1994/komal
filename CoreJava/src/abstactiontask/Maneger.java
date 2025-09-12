package abstactiontask;

public class Maneger extends Employee
{

	
	 Maneger(double salary) {
	        super(salary);
	    }
	    @Override
	    void deductAndPrint() {
	        int salary = 100000;
			double deductedSalary = salary - (salary * 0.10);
	        System.out.println("Manager salary deduct by 10%:"+deductedSalary);
}
}