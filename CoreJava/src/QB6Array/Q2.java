package QB6Array;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no:");
		   int a =sc.nextInt();
		   int []a1=new int[5];
		   
		   for (int i=0;i<=a1.length;i++)
		   {
			   System.out.print(i+"  ");
		   }
		   for(int i=0;i<a1.length;i++)
		   {
			   System.out.println(a1[i]);
		   }
		
	}

}
