package Array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter your size:");
		
		int size =sc.nextInt();
		
		int a[]=new int[size];
//		input:
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
//		output:
		for(int i=0;i<size;i++)
		{
		System.out.println(a[i]);
		}
	}

}
