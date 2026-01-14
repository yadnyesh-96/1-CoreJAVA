

import java.util.*;
public class StrongNumApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enyter the Number to check Perfect or not:");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0){
				
			int rem=n%10;
			int fac=1;
			for(int i=1; i<=rem; i++){
				fac*=i;
			}
			sum+=fac;
			n=n/10;
		}
		
		System.out.println(sum);
		
	}
}