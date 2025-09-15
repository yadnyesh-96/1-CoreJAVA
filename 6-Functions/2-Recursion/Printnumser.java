// Write a program to print numbers from 1 to n using recursion.

public class Printnumser{
	public static void main(String x[]){
		
	System.out.println(sequence(8));
	}
	
	public static void sequence(int n){
		
		if(n == 0){
			return;
		}
		
	//	sequence(n-1);
		sequence(n-1);
		return n;
	}

}