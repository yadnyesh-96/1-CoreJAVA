//5.Write program to input number and check number is perfect or not?

import java.util.*;
public class FivechekPerfectNumApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Number to check the perfect or not");
	System.out.println("Enter the Number:");
	int num=sc.nextInt();
	
	int i=1;
	int sum=0;
	while(i!=num){
		
		if(num%i==0){
			sum+=i;
		}
		i++;
	}
	
			System.out.println(sum==num ? "|-->"+num+" is Perfect Number" : "|-->"+num+" is not Perfect Number");
	}


}