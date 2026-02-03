//WAP to create a function name as void factorial(int no) this function accepts a 
// number from the keyboard and calculates its factorial

import java.util.*;
public class CalFactApp{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number form KeyBoard:");
		int no = sc.nextInt();
		int res = fac(no);
		System.out.println("Factorial is :"+res);
	}
	
	public static int fac(int no){
		int fac=1;
		for(int i=1; i<=no; i++){
			fac*=i;
		}
		return fac;
	}
}