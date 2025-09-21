package controlStatementProgram;

public class CalculatorSwitchCase {
	public static void main(String[] args) {
		
		double no1=45;
		double no2=23;
		
		char oprator='*';
		double result;
		switch (oprator) {
		case '+': {
			
			result= no1+no2;
			System.out.println(result);
			break;
		}
case '-': {
			
			result= no1-no2;
			System.out.println(result);
			break;
		}
case '*': {
	
	result= no1*no2;
	System.out.println(result);
	break;
}
case '/': {
	if(no2!=0)
	{
	result= no1/no2;
	System.out.println(result);
	break;
}


		
		}
	}
	
		
	}
}
