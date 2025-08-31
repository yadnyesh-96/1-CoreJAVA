//8.Write program to input number and check number is Armstrong or not?

import java.util.*;

public class EightChkNumArmstrongApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int count=0,i=0,sum=0;
		
		while(i!=num){
			++count;
			int rem=num%10;
			num=num/10;
		}
		
		num=temp;
		
		while(i!=num){
			int rem2=num%10;
			int pow=(int)Math.pow(rem2,count);
			sum+=pow;
			num=num/10;
		}
		
		System.out.println(sum==temp? "|-->"+temp+" Is Armstrong Number" : "|-->"+temp+" Is Not Armstrong Number");
		
		
	}
}