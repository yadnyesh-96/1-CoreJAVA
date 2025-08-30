//3.Write program to character from keyboard and check character is alphabet digit or special symbols?

import java.util.*;
public class ThreeChekInput{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Give the Input from Keyboard:");
	char a=sc.next().charAt(0);
	
	if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
            System.out.println("Alphabetical Input");
        } else if (a >= '0' && a <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }
	
	}
}
