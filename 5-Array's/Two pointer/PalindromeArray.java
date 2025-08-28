/*
Check Palindrome Using Two Pointers
Check if a string is a palindrome using the two-pointer approach.
*/

import java.util.*;
//import java.util.Arrays;

public class PalindromeArray{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{121, 1331, 4554, 8791, 1221};
		
		
		
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length; i++){
			//a[i] == 121 1331 4554 8791 1221 
			
				int num=a[i];
				int count=0;
		
			while(0 != num){
					++count;
					int rem=num%10;
					num=num/10;
				}
	
				num=a[i];
				
			int pow =(int)Math.pow(10,count-1);
	
				int last = num%10;
				int num1=num%10; //3 last
					num1=num1*pow; // 3000
				int	num2=num%pow; //113 
					num2=num2/10; //11
					num2=num2*10;
		
				int sum=num1+num2+last;
		 System.out.println((a[i]==sum?"Palindrome :"+a[i]+"." : "Not Palindrome :"+a[i]+"."));
		}
			
	
	}
}


