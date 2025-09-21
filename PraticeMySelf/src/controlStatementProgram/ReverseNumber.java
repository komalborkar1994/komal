package controlStatementProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=123434;
		int reversenumber=0;
		while(number!=0)
		{
			int remainder=number%10;
			reversenumber=reversenumber*10+remainder;
			number=number/10;
			
		}
		System.out.println("reverseno:"+reversenumber);
		
		
		
		
		
		
		
		
	}
}
