/*
 **8. Email Address Validator**

**Description:**

* Ask the user for an email address.
* If email doesn’t contain '@', **continue** to ask again.
* If user enters "cancel", **break**.
* Use a do-while loop to validate and accept only proper emails.

*/
import java.util.*;
public class EmailValidator{
	
	
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	
	do{
		System.out.println("Enter the Valid email");
	String str=sc.nextLine();
	
	boolean flag = false;
	for(int i=0; i< str.length(); i++){

		char ch=str.charAt(i);
		
		if(ch == '@'){
			flag = true;
			
		}
		
	}
	
	 if (str.equalsIgnoreCase("cancel")) {   // exit if user types cancel
                System.out.println("Cancelled by user.");
                break;
            }
		
		if(flag){
			System.out.println("Valid Email");
			flag = false;
			break;
		}else{
			
			System.out.println("invalid email");
			continue;
		}
		
		
	}while(true);
	}
	
	
	
}