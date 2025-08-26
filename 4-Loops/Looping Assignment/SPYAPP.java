/*
Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8

*/

public class SPYAPP{

		public static void main(String x[]){
		
		
		int num = 1412;
		int rem;
		int sum = 0;
		int pr = 1;
		
				while(num !=0){
					
					rem = num%10;
					sum = sum+rem;
					pr = pr*rem;
					num = num/10;
					
			
			
				}
				String str = pr==sum ? "Given Number is spy" : "Given Number is not spy";
				System.out.println(str);
		
		
		}

}