

import java.util.*;
public class PrimeApp{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		boolean isPrime=true;
		if(num<=1){
			isPrime=false;
		}else{
			for(int i=2; i<=num/2; i++){
				if(num%i==0){
					isPrime=false;
				}
			}
		}
		
		
		System.out.println(isPrime?"Prime":"Not-Prime");
		
		
	}
}