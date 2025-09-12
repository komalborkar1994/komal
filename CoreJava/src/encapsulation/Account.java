package encapsulation;

public class Account {
	private String accountholder;
	private double balance;
	public String getAccountholder() {
		return accountholder;
	}
	
	public double getBalance() {
		return balance;
	}
	public void deposite(double amount) {
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("you have deposited: "+amount+ "rs.");
			System.out.println("new balance is:"+getBalance()+ "rs.");
		}
		else {
			System.out.println("Invalide deposite amount");
		}
				
			}

	public void setHolder(String string) {
		// TODO Auto-generated method stub
		
	}

	public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}

		

}
	


