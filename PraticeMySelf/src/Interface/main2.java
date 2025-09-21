package Interface;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		PaymentCheckout checkout=new PaymentCheckout();
		
		System.out.println("choose payment method");
		System.out.println("1.UPI");
		System.out.println("2.NetBanking");
		System.out.println("Enter Choice");
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:
			checkout.payment(new UpiPayment());
			
			
			break;
			
		case 2:
			
			checkout.payment(new NetBankingPayment());
			break;
			
			

		default:
			break;
		}
		
		
	}
		
	}
