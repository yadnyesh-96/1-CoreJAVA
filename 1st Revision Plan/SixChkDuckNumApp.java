// 6.Write program to input number and check number is duck or not?


import java.util.*;
public class SixChkDuckNumApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Number to check Duck or not");
	System.out.println("Enter the number:");
	
	int num=sc.nextInt();
	int temp=num;
	int i=0;
	boolean flag=false;
	while(i != num){
		
		int rem=num%10;
		if(rem==0){
			flag=true;			
		}
		num=num/10;
		
		
	}
	num=temp;
	System.out.println(flag? "|-->"+num+" Input Number is Duck" : "|-->"+num+" Input Number is not Duck");
	
	}

}