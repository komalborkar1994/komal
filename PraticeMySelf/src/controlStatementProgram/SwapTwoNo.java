package controlStatementProgram;

public class SwapTwoNo {
	public static void main(String[] args) {
		int no1=67;
		int no2=23;
//		System.out.println("Before Swapping:no1="+no1 +",no2="+no2);
		
		
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("After swapping:no1="+no1 +", no2="+no2);
		
		
		
		
	}

}
