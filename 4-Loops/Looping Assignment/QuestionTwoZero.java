// Q20. Write a java program to swap first and last digits of a number.


import java.util.*;
public class QuestionTwoZero{

	public static void main(String x[]){
		int count=0;
		int no =12345;
		int temp = no;
		System.out.println("Before the Swaping no:"+temp);
		System.out.println("----------------------------------");
		while(no!=0){
				++count;  // counts the 5 times instead of 12345 is equal to ==0;
				no = no/10;		
		}	
		no = temp;
		int last = no%10; // 12345%10 == 5;
		int p = (int)Math.pow(10,--count); // 10^4 == 10000
		int first = no/p; // 12345/10000 == 1 seperated first  digit
		no = no %p; // 12345 % 10000; == 2345 removed first digit 
		no = no /10; // 2345 /10 == 234 removed last digit
		last = last*p; // 5*10000 == 50000 
		no = no*10;     // 234 * 10 == 2340
		no = last + no + first; //50000 + 2340 + 1 ==52341.
		System.out.println("After the Swaping no:"+no);
	
	}

}