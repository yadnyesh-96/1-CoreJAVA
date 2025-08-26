/*
Q46. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them.
 Compare sum with the number.

*/


public class AbundantNumApp{

		public static void main(String x[]){
		int n =1;
		
		while(n<=100){
		
						int no = n;
						int i = 1;
						int sum=0;
						while(i!=n){
							
							if(no%i==0){
								sum=sum+i;
							}
							i++;
							
						}
						if(sum>no){
							System.out.println(no+" :Number is Abundant");
						}
			n++;		
		}
		
		}


}