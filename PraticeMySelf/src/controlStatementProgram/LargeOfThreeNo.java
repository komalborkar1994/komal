package controlStatementProgram;

public class LargeOfThreeNo {
	public static void main(String[] args) {
		int no1=34;
		int no2=45;
		int no3=67;
		if(no1>no2 && no1>no3)
		{
			System.out.println("the greater no1 is:"+no1);
		}else if (no2>no1 && no2>no3) {
			System.out.println("the greater no2 is:"+no2);
		}
		else {
			System.out.println("the greater no3 is:"+no3);
		}
	}

}
