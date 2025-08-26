/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of 
steps wherein each step number is replaced by the sum of squares of its digit, 
that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/

public class HapAPP{
	
	public static void main(String x[]){
		
		int num = 19;
		int rem;
		int sqr;
		int sum = 0;
		int no=0; 
		
		
			while(num !=0){
				rem = num%10; //9
					sqr = rem*rem;
					
					sum = sum+sqr;
				 num = num/10; 
			
			}
			no = sum;
			
			while(no !=0){
						rem = no%10; //9
						sqr = rem*rem;
						sum = sum+sqr;//82
						System.out.println("3."+sum);
						num = num/10;
				}
			
			
				System.out.println("Breaks");
	}


}