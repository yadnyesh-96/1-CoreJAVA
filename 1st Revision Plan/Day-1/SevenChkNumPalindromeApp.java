// 7.Write a program to input numbers and check if the number is palindrome or not?


import java.util.*;
public class SevenChkNumPalindromeApp{
	 public static void main(String x[]){
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the Number:");
	 int num=sc.nextInt();
	 int temp=num;
	 int count=0,i=0;
	 
		while(i!=num){
			++count;
			int rev=num%10;
			num=num/10;
		}
	 
	 num=temp;
	 
	 int pow=(int)Math.pow(10,count-1);
	 
	 int end=num%10;
	 end=end*pow;
	 int first=num/pow;  
	 num=num%pow;  //(num=7894)-->  %1000=894 
	 num=num/10;
	 num=num*10;
	 
	 int sum=end+first+num;
	 
	 System.out.println(temp==sum? "|-->"+temp+" Is Palindrome" : "|-->"+temp+"Is Not Palindrome");
	 }


}