// Q15. Write a java program to print all ASCII characters with their values.

import java.util.*;
public class QuestionOneFive{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	do{
	System.out.println("Enter 1 for Upper latters and 2 for Lower latter");
	int no;
	int num = sc.nextInt();
	
	
	
		
		
		switch (num){
			
			case 1:
			
				no = 65;
				while (no <=90){
				System.out.println((char)no+"="+no);
				no ++ ;
				}
			break;
			
			case 2:
				no = 97;
				while (no <=122){
				System.out.println((char)no+"="+no);
				no ++ ;
				}
		
		}
	 }	
	
	
	}

}