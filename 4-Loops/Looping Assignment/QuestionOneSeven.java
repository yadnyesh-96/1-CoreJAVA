// Q17. Write a java program to find all factors of a number.

import java.util.*;
public class QuestionOneSeven{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		
		while(num != 0){
			
			n = n*num;
			System.out.println("\n"+n);
			
			--num;
			
		}
				//System.out.println("\n"+n);

	}
}