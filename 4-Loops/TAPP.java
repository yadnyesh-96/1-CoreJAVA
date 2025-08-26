// WAP to input the number and print the table .

import java.util.*;
public class TAPP{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println(Enter the number to print their table:");
	int num = sc.nextInt();
	int i = 1;
	
	while(i <= 10){
		
		int tab = num*i;
		System.out.println(num+" x "+i+"= "+tab);
		i++;
	}
	}
}