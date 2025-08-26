// Q18. Write a java program to find the first and last digit of a number.

public class QuestionOneEight{

	public static void main(String x[]){
	
		int no = 78;
		int count = 0;
		
		int temp=no;
		
		while(no!=0){
			++count;
			no=no/10;
		}
		no = temp;
		int last = no%10; //12345 %10 == 5;
		int p = (int)Math.pow(10,--count);// 10^4 == 10000
		int first = no/p; // first digit 12345/10000 == 1
		
		System.out.println("Given number is:"+temp);
		System.out.println("First digit of Given number:"+first);
		System.out.println("last digit of Given number :"+last);
	
	}
}