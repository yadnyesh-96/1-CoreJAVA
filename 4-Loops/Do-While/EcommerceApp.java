/*
 **5. E-commerce Checkout Simulation**

**Description:**

* Display a list of items with prices.
* Use a do-while loop to let the user keep adding items to the cart until they type "checkout".
* If they type "skip", use **continue** to skip adding that item.
* On checkout, print the total and exit the loop.
*/

import java.util.*;
public class EcommerceApp{

		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.Smartphone (Redmi Note 13, 6GB RAM, 128GB)    - 14,999 Rs.");
			System.out.println("2.Wireless Earbuds (boAt Airdopes 141)          -  1,199 Rs.");
			System.out.println("3.Laptop (HP 15s, Intel i5, 8GB/512GB SSD)      - 46,990 Rs.");
			System.out.println("4.Smartwatch (Noise ColorFit Pulse 3)           -  1,499 Rs.");
			System.out.println("5.Bluetooth Speaker (JBL Go 3)                  -  2,799 Rs.");
			System.out.println("6.Backpack (American Tourister 32L)             -  1,699 Rs.");
			System.out.println("7.Men’s Running Shoes (Adidas Lite Racer 3.0)   -  2,999 Rs.");
			System.out.println("8.Women’s Handbag (Lavie Satchel)               -  2,299 Rs.");
			System.out.println("9.Power Bank (Mi 10000mAh, 22.5W Fast Charging) -  1,299 Rs.");
			System.out.println("10.Electric Kettle (Prestige PKOSS 1.5L)        -    849 Rs.");
			System.out.println("-------------------------------------------------------------");
			
			int sum=0;
			do{
				System.out.println("Add to cart the item:");
				String str =sc.nextLine();
				
				
				if(str.equals("checkout")){
					System.out.println("Total amount "+sum+" Rs.");
					
					break;
				}
				
				if(str.equals("skip")){
					continue;
				}
				
				switch(str){
					
					case "1": sum=sum+14999; 
						System.out.println("1.Smartphone (Redmi Note 13, 6GB RAM, 128GB)    - 14,999 Rs.");
								break;
								
					case "2": sum=sum+1199;
						System.out.println("2.Wireless Earbuds (boAt Airdopes 141)          -  1,199 Rs.");
								break;
								
					case "3": sum=sum+46990;
						System.out.println("3.Laptop (HP 15s, Intel i5, 8GB/512GB SSD)      - 46,990 Rs.");
								break;
								
					case "4": sum=sum+1499; 
						System.out.println("4.Smartwatch (Noise ColorFit Pulse 3)           -  1,499 Rs.");
								break;
								
					case "5": sum=sum+1499;
								System.out.println("5.Bluetooth Speaker (JBL Go 3)                  -  2,799 Rs.");

								break;
								
					case "6": sum=sum+1699;
								System.out.println("6.Backpack (American Tourister 32L)             -  1,699 Rs.");

								break;
								
					case "7": sum=sum+2999;
								System.out.println("7.Men’s Running Shoes (Adidas Lite Racer 3.0)   -  2,999 Rs.");

								break;
								
					case "8": sum=sum+2299;
								System.out.println("8.Women’s Handbag (Lavie Satchel)               -  2,299 Rs.");

								break;
								
					case "9": sum=sum+1299;
								System.out.println("9.Power Bank (Mi 10000mAh, 22.5W Fast Charging) -  1,299 Rs.");

								break;
								
					case "10": sum=sum+849;
								System.out.println("10.Electric Kettle (Prestige PKOSS 1.5L)        -    849 Rs.");

								break;
								
					default:
						System.out.println("Invalid Input");
						continue;
					
				}
				

					
				}while(true);
					
				
		}
			
			
}


