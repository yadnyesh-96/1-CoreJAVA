// Example:  WAP to input number from keyboard and check number is perfect or not?


import java.util.*;
public class PAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check perfect or not:");
		int num = sc.nextInt();
		int i =1;
		int sum = 0;
		
		while(i <= (num/2)){
			if(num%i==0){
				sum=sum+i;
			}
			i++;
			
		}
		
		System.out.println(str);
	}
	
}