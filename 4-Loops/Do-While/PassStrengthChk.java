/*
3. Password Strength Checker
Description:
* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit.

---
*/
import java.util.*;
public class PassStrengthChk{

		public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		do{
			
			System.out.println("-----------------------------------");
			System.out.println("Please Enter the PassWord:");
			int pass=sc.nextInt();
			int pass1=1221;
			
			if(pass==pass1){
				System.out.println("Password accepted");
				System.exit(0);
				break;
			}
		}
		
		
		
		
	}

}
