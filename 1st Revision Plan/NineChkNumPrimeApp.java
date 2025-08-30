// 9.Write program to check if the number is prime or not?

import java.util.*;
public class NineChkNumPrimeApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		boolean flag=true;
		
		if(num<=1){
			flag=false;
		}else{
			
			int i=2;
			
			while(i <=num/2){
				
				if(num%i==0){
					flag=false;
					break;
				}
				
				i++;
			}
			
		}
		
		System.out.println(flag? "|-->"+num+" Is Prime Number" : "|-->"+num+" Is not Prime Number");
		
	}


}