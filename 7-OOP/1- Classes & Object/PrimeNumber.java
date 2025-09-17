/*
14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/

public class PrimeNumber{
	public static void main(String x[]){
//	Scanner sc=new Scanner(System.in);
		PrimeChecker c=new PrimeChecker();
		c.isPrime(7);
	}

}

class PrimeChecker{
	public static void isPrime(int n,int i){
				if(n==1)
					return 1;
					
				if(n==2)
					System.out.println("Is Prime");
					
				if(n%i==0){
					if(i==n){
					System.out.println("Is Prime");
					}
				}else{
					System.out.println("Not Prime");
				}
				
				isPrime(n,i+1);
	}

}