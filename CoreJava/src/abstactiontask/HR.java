package abstactiontask;

public class HR  extends Employee{
	HR(double salary) {
        super(salary);
    }
    @Override
    void deductAndPrint() {
        
        System.out.println("HR salary deducted by 20% :");
}


}

	

