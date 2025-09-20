// Write a program to print the first n Fibonacci numbers using recursion.


public class FibonacciSerise{
	public static void main(String x[]){
		
		int num=8;
		
		for(int i=0; i<=num; i++){
			
			System.out.printf("%d\t",fiboS(i));
		}
	
	}

	public static int fiboS(int n){
		
		if(n<=1){
			return n;
		}
		return fiboS(n-1)+fiboS(n-2);
		
	}

}