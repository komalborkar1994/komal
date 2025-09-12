package encapsulation;

public class BankApp {
	public static void main(String[] args) {
		Account account=new Account();
		account.setHolder("komal");
		account.deposite(100000);
		account.withdraw(2000);
		account.deposite(1000);
		
		
		
	}

}
