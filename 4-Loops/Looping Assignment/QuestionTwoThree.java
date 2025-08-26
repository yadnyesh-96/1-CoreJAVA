/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, 
For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/


public class QuestionTwoThree{

	public static void main(String x[]){
	
		int num = 1245;
		int remo;
		boolean flag = false;
		while(num != 0){
			 remo = num%10; //5
			 num = num / 10; //120
			
			if(remo == 0){
					flag = true;
					break;
			}
				
			 
		
		}
		if(flag){
			System.out.println("Duck");
		}else{
			System.out.println("Not Duck");
		}			
	}

}