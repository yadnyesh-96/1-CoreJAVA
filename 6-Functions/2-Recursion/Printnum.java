//Write a program to print numbers from n down to 1 using recursion.

public class Printnum{
	public static void main(String x[]){
		
		series(8);
		
	}
	
	public static void series(int n){
		if(n<=0){
			return;
		}
		
		System.out.println(n);
		series(n-1);
	}
}