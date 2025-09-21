package polymorphism;

public class Calculator {
	
	public void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition of first method:"+sum);
	}
	public void addition(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Addition of second no:"+sum);
	}

}
