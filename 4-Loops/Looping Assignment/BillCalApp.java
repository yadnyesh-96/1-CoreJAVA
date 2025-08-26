/*
Q5.Write a menu-driven program using switch and do-while to perform:
1.Enter product price and quantity, calculate total bill
2.Apply discount (10% if bill > ₹1000)
3.Calculate GST on bill amount (18%)
4.Compare final bill amount with a given value
5.Exit the program

*/

import java.util.*;
public class BillCalApp{

		public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
				System.out.println("--------------------------------------------------------------");
				System.out.println("1.Enter product price and quantity, calculate total bill");
				System.out.println("2.Apply discount (10% if bill > ₹1000)");
				System.out.println("3.Calculate GST on bill amount (18%)");
				System.out.println("4.Compare final bill amount with a given value");
				System.out.println("5.Exit the program");
				System.out.println("-------------------------------------");
				
				
		  do{		
				System.out.println("Select the option : ");
				int choice=sc.nextInt();
				
				int total=0;
				System.out.println("Enter the Price of Product: ");
				int price=sc.nextInt();
				System.out.println("Enter the Quantity : ");
				int qty=sc.nextInt();

				switch (choice){
					
							case 1:
								System.out.println("------------------------------------");
								System.out.println("Calculation of Total Billing");
								System.out.println("The total Bill : "+(price*qty));
							break;
							
							case 2:
								System.out.println("----------------------------------");
								System.out.println("Check the discount (10% if bill > ₹1000)Available on our bill");
							
								int disc=((10/100)*total);
								if(disc>1000){
									System.out.println("Your are applicable for the Discount");
									System.out.println("(10% if bill > ₹1000)");
								}else{
									System.out.println("Your total bill not the applicable for the Discount");
								}
							break;
					
					
				}
		
		  }while(true);
		
		}

}