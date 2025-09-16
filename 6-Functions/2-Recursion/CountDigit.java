// Write a program to count the number of digits in a given number using recursion.

public class CountDigit{
	public static void main(String x[]){
		
	int count =	Countdigit(123);
	System.out.println(count);
	}
	
	public static int Countdigit(int n){
		
		if(n==0){
		return 0;	
		}
		
	
		
		 


	return 1 + Countdigit(n/10);
	}
	
}