package exceptionHandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("code Stareted");
		
		int a=12;
		Scanner scanner=new Scanner(System.in);
		int value=scanner.nextInt();
		try {
			int div=12/value;
			System.out.println(div);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally executed");
		}
		}
		
	}


