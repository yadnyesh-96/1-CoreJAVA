// 3.Write a C program to print all alphabets from a to z. - using while loop		char ch = (char) num; 

import java.util.*;
public class QuestionThree{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Option which to print:1.Upper case 2.Lower case.");
		int no = sc.nextInt();
		int n;
		switch (no){
			
			case 1:
				 n = 65;
		
				while ( n <= 90){
		
					System.out.println((char)n);
					n++;
				}
			break;
			
			case 2:
				 n = 97;
		
				while ( n <= 122){
		
					System.out.println((char)n);
					n++;
				}
			break;
		
		
		}
	}

}