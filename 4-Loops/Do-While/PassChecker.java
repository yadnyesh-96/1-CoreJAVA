/*
**Description:**

* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit.

---
*/
import java.util.*;
public class PassChecker{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
	do{	
		System.out.println("Enter the password:");
		String str = sc.nextLine();
		int a= str.length();
		
		if(str.equals("quit")){
			
			System.exit(0);
		}
		if(a>=6){
			
			System.out.println("Password accepted");
			break;
		}else{
			System.out.println("Length to short");
			continue;
		}
		
	}while(true);
	
	
	}

}