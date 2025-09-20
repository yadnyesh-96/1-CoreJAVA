/*
17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.
*/
import java.util.*;
class DigitSumCalculator{
	
	int getDigitSum(int a){
		int sum=0;
		while(a!=0){
			int rem=a%10;
			sum+=rem;
			a=a/10;
		}
		return sum;
	}
	
}

public class CalculateSum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		DigitSumCalculator d=new DigitSumCalculator();
		
		int res=d.getDigitSum(num);
		System.out.println("Sum of Digit is:"+res);
	
	}

}