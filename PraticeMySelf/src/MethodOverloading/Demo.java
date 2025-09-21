package MethodOverloading;



public class Demo {
	public static void main(String[] args) {
		Calculator calculator1=new Calculator();
		
		int result=calculator1.Addition(12, 10);
		System.out.println("addition of two no:"+result);
		
		
		 double result2=calculator1.Addition(1.2, 4.5);
		System.out.println("Addition of double no:"+result2);
		
	;
		 int result3=calculator1.Addition(10, 10, 10);
		System.out.println("Addition of three no:"+result3);
		
		
		
	}

}
