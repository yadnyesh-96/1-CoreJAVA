// Example: WAP to input base and index from keyboard and calculate power of value

import java.util.*;
public class POWAPP{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base:");
		int base= sc.nextInt();
		System.out.println("Enter the index:");
		int index= sc.nextInt();
		int i = 1;
		int pow = 1;
		
		while(i <= index){
			pow = pow*base;
			i++;
		}
		System.out.println(base+" power "+index+" is "+pow);
	}
}