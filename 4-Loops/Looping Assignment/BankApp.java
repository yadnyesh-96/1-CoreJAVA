/*
Q1. Problem Statement:
 Write a menu-driven program using do-while and switch-case to perform operations on a bank account balance (initial balance entered by user):
Deposit money.
Withdraw money (only if sufficient balance).
Check current balance.
Exit.
Program should repeatedly allow operations until exit.

*/

import java.util.*;
public class BankApp{

	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);

					int bal=500;
					System.out.println("----- Menu -----");
					System.out.println("1.Deposit Money. ");
					System.out.println("2.Withdraw Money.");
					System.out.println("3.Check current Balance.");
					System.out.println("4.Exit.\n");
					System.out.println("------------------------------");
					System.out.println("|| Current Balance :"+500+" ||");
					System.out.println("------------------------------");
					
			
					
		do{
					System.out.println("------------------------------");
					System.out.println("Select the option from above menu");
					String str = sc.nextLine();
					
					
					if(str.equals("Exit")){
						System.out.println("------------------------------");
						System.out.println("Current Balance: "+bal);
						System.exit(0);
					}
					
					
					switch (str){
								case"1":
									System.out.println("------------------------------");
									System.out.println("Enter the Deposit Amount:");
									int dpt=sc.nextInt();
									sc.nextLine(); // consume newline
									bal=bal+dpt;
									System.out.println("Current Account Balance: "+bal);
									System.out.println("Thank You..!");
									System.out.println("------------------------------");
									break;
									
							
								case"2":
									System.out.println("------------------------------");
									System.out.println("Enter the Withdraw Amount:");
									System.out.println("Current Account Balance: "+bal);
									int wamt=sc.nextInt();
									sc.nextLine(); // consume newline
									
									if(wamt>bal){
										System.out.println("Account balance has insufficient");
										System.out.println("Account Balance: "+bal);
										
									}else if(bal-wamt>=500){
										bal=bal-wamt;
										System.out.println("Current Account Balance: "+bal);
										System.out.println("Thank You..!");
										
									}else{
										System.out.println("Account balance has must be minimum 500");
										System.out.println("Account Balance: "+bal);
										System.out.println("For the withdraw the balnce should be more than 500");
									}
								
									break;
									
									
								case"3":
									System.out.println("------------------------------");
									System.out.println("Current Account Balance: "+bal);
									System.out.println("Thank You..!");
									break;
									
								case"4":
									System.out.println("------------------------------");
									System.out.println("Exit");
									System.out.println("Thank You..!");
									break;
									
								case"Exit":
									break;
									
								default:
									System.out.println("Invalid input try again .. !");
									continue;
								
						
					}
			
		}while(true);
			
			
		
		
		
	}

}