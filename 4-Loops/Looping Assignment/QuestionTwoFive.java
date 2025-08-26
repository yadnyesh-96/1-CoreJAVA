/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of 
its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers 
	  and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
*/

public class QuestionTwoFive{

	public static void main(String x[]){
	
		int n = 153;
	//	int mul ;
		
		while(n !=0){
				int st = n%10; 
				     n = n/10;
				int mul = 3*st;	 
			
		}
		
		String str = n==mul ? "Armstrong" : "not Armstrong";
		System.out.println(str);
	}

}