package controlStatementProgram;

public class LeapYear {
	public static void main(String[] args) {
		
		int year=2024;
		if((year%400==0)||(year%4==0 &&year%100!=0))
		{
			System.out.println("it is leap year:"+year);
		}
		else {
			System.out.println("it is not leap year:"+year);
		}
		
	}

}
