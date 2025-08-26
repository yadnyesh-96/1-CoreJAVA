/*
 **2. Menu-Driven Calculator**

**Description:**

* Display a menu with 4 operations: Add, Subtract, Multiply, Divide.
* Use a do-while loop to keep showing the menu until the user chooses "Exit".
* Use **continue** to skip calculation if the user enters an invalid choice.
* If the user enters "Exit", **break** the loop.

---
*/
import java.util.*;
public class Calculator{


		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Menu-Driven Calculator");
			do{
				System.out.println("-------------------------------");
				System.out.println("1.Add  2.Substraction  3.Multiply  4.Divide  5.Exit");
				int choice=sc.nextInt();
				int a=0;
				int b=0;
				
				switch (choice){
					
					case 1: 
					System.out.println("Slected the: Addition");
					System.out.println("Enter the 1st Number:"); 
					 a=sc.nextInt();
					System.out.println("Enter the 2nd Number:"); 
					 b=sc.nextInt();
					System.out.println("The Adition of 1st & 2nd Number is:"+(a+b));
					continue;
					
					case 2:
				
					System.out.println("Slected the: substraction");
					System.out.println("Enter the 1st Number:"); 
					 a=sc.nextInt();
					System.out.println("Enter the 2nd Number:"); 
					 b=sc.nextInt();
					System.out.println("The substraction of 1st & 2nd Number is:"+(a-b));
					continue;
					
					case 3:
					
					System.out.println("Slected the: Multiplication");
					System.out.println("Enter the 1st Number:"); 
					 a=sc.nextInt();
					System.out.println("Enter the 2nd Number:"); 
					 b=sc.nextInt();
					System.out.println("The Multiplication of 1st & 2nd Number is:"+(a*b));
					continue;
					
					case 4:
					
					System.out.println("Slected the: Divide");
					System.out.println("Enter the 1st Number:"); 
					 a=sc.nextInt();
					System.out.println("Enter the 2nd Number:"); 
					 b=sc.nextInt();
					System.out.println("The Divide of 1st & 2nd Number is:"+(a/b));
					
					continue;
					
					case 5:
					 System.out.println("Exit");
					 System.exit(0);
					 break;
					
					default :
					System.out.println("invalid choice");
					continue;
					
				}
			}while(true);
		}


}