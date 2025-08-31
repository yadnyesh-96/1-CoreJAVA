// 2.Write program to input number using Scanner class and reverse it?

import java.util.*;
public class TwoRevNumApp{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number (more than 2-digit):");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(0!=num){
			++count;
			int rev=num%10;
			num=num/10;
		}
		
		//4554 --> count --> 4 digit 
		num=temp; // num restored & count --> counted according to digit.
		int pow=(int)Math.pow(10,count-1); // power -->1000.
		int end=num%10; // last digit 4 
		end=end*pow;
		int start=num/pow; // First digit 4. 
		num=num%pow;  // 554
		num=num/10;
		num=num*10;
		
		int rev2=num+end+start;
		
		System.out.println("Your Enter Number is:"+temp);
		System.out.println("The reversed Number is the:"+rev2);
		
		
	}

}