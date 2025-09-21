package MethodOverriding;



public class Demo {
	public static void main(String[] args) {
		
		Bank bank=new SBI();
		System.out.println("SBI interestRate"+bank.getInterestRate());
		
		Bank bank2=new HDFC();
		System.out.println("HBFC interestrate:"+bank2.getInterestRate());
		
		Bank bank3  = new  ICCI();
		System.out.println( "ICCI interestRate"+bank3.getInterestRate());
		
	}
	

}
