/*
Q2.Problem Statement:
 Write a menu-driven program using do-while and switch-case to:
1.Check if a number is prime.
2.Find the sum of digits of a number.
3.Reverse a number.
4.Exit.
Perform operations repeatedly until the user selects exit.
*/

import java.util.*;
public class MenuNumApp{

		public static void main (String x[]){
		Scanner sc=new Scanner(System.in);
		
			System.out.println("1.Check if a number is prime");		
			System.out.println("2.Find the sum of digit of a number");		
			System.out.println("3.Reverse a number");		
			System.out.println("4.Exit");		
			System.out.println("-----------------------------------------");

				
			 do{
						System.out.println("Select the option:");
						String str=sc.nextLine();
			
			
						if(str.equals("Exit")){
							System.out.println("Exit");
							System.exit(0);
						}
			
			
						switch (str){
									
									case"1":
										System.out.println("Prime number");
										break;
										
									case"2":
										System.out.println("Find the sum");
										System.out.println("Enter the Number to find there sum:");
												int num=sc.nextInt();
												int sum=0;
												sc.nextLine();
												while(num!=0){
													
													int num1=num%10;
													sum+=num1;
													num=num/10;
												}
												System.out.println("sum of the Number is: "+sum);
										break;
										
									case"3":
										System.out.println("Reverse the NUmber");
										System.out.println("Enter the Number to reverse");
										int num1=sc.nextInt();
										sc.nextLine();
										int rev=0;
	
										while(num1!=0){
											int rem=num1%10;
											rev=rem+rev*10;
											num1=num1/10;
										}
										System.out.println("Reverse Number is: "+rev);
										break;
										
									case"4":
										System.out.println("Exit");
										System.exit(0);
										break;
									
									case"Exit":
										System.out.println("Exit");
										
										break;
									
									default:
										System.out.println("Invalid Input");
										break;
				
				
				
				
								}
			
				}while(true);
		
		}

}