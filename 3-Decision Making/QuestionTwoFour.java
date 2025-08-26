//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.
//A - 65
//Z - 90
//a-97
//z-122
//sp * 33 to 38

import java.util.*;
public class QuestionTwoFour{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabets to check:");
		char ch = sc.next().charAt(0);
		int a = ch;
		//System.out.println(a);
		
		if ( (a>=65) && (a<=90)){
				System.out.println("Uppercase");
		}else if ((a>=97) && (a<=122)){
				System.out.println("Lowercase ");
		}else{
				System.out.println("Invailid Input");
		}	
	}

}