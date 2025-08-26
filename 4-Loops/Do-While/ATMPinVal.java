/*
1. ATM PIN Validation

Description:
Write a program that:

* Asks the user for a 4-digit ATM PIN.
* Gives **max 3 attempts** to enter the correct PIN using a do-while loop.
* If the PIN is correct, print "Access Granted" and **break** the loop.
* If attempts are over, print "Card Blocked".

---
*/
import java.util.*;
public class ATMPinVal{


		public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		
		int count=1;
		int pass=1258;
		
		do{
			System.out.println("------------------------------------");
			System.out.println("Enter the 4-digit ATM PIN:");
			int pin = sc.nextInt();
			if(pass==pin){
				System.out.println("Access Granted");
				System.out.println("------------------------------------");
				break;
			}else{
				count++;
				if(count==4){
					System.out.println("Incorect PIN try again Later you reached Limit");
					System.out.println("------------------------------------");
				//	System.out.println("Incorect password Plz try again");
				}else{
					System.out.println("Incorect PIN try again you have Limit (3/:"+count+")");
					System.out.println("------------------------------------");
				}
			}
		
		
		}while(count<=3);
			if(count==4){
				System.out.println("Card Blocked ... !");
			}
		}


}