package Polymorphism;


public class Methodoverloding {
	
//	methodoverloding 
	public void addition( int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
//in overloding accessmodifier and the veriable doesnot matter:	
protected void addition(int x,int y,int z,int r)
{
	int sum=x+y;
	System.out.println(sum);
}
	public void addition( int a,int b ,int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
//	constuctor in methodoverloading:
	public void Substaction(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
		
	}
	public void Substaction(int a,int b,int c)
	{
		int sub=a-b-c;
		System.out.println(sub);
		
	}
//	sequence of parameter will be didfferent:
	
	public void printName(String name) {
		System.out.println("komal");
	}
	public void printName( int age,String name  ) {
		System.out.println("komal");
		System.out.println("28");
	}
	
	
	
	
	
	
	

}
