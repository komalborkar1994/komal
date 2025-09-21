package controlStatementProgram;

public class PalindromNumber {
	public static void main(String[] args) {
		int no=12321;
		int originalno=no;
		int reverseno=0;
		
		while(no!=0)
		{
			int digit=no%10;
			reverseno=reverseno*10+digit;
			no=no%10;
			
			
			
		}
		
		if(originalno==reverseno)
		{
			System.out.println("it is palindronno");
			
		}
		else {
			{
				System.out.println("it is not palindrom no");
			}
		}
	}

}
