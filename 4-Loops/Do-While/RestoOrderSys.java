/*
 **9. Restaurant Ordering System**

**Description:**

* Show menu items and let user order.
* If they choose "skip", **continue** to next iteration without adding to order.
* If "done" is entered, **break** and print final bill.
* Implement using a do-while loop.

---
*/
import java.util.*;
public class RestoOrderSys{

	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
    System.out.println("--------------------------------"); 
    System.out.println("1.Dal Makhani:         = 235 Rs.");        
    System.out.println("2.Shahi Paneer:        = 275 Rs.");        
    System.out.println("3.Palak Paneer:        = 270 Rs.");       
    System.out.println("4.Aloo Gobi:           =  75 Rs.");    
    System.out.println("5.Vegetable Biryani:   = 265 Rs.");             
    System.out.println("6.Veg Fried Rice:      = 190 Rs.");          
    System.out.println("7.Matar Paneer:        = 180 Rs.");        
    System.out.println("8.Chole Bhature:       = 70  Rs."); 
    System.out.println("--------------------------------"); 
	
	
	int sum=0;
		do{
			System.out.println("Selects your order:");
			String sel = sc.nextLine();
			if(sel=="1"){
				sum=sum+235;
			}
			
			if(sel=="2"){
				sum=sum+275;
			}
			
			if(sel=="Done"){
				System.out.println(sum);
				break;
			}
			
		}while(true);
	
	}


}