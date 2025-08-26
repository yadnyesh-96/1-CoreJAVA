//Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.


import java.util.*;

public class QuestionNine{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Alphabets in capital':");
	char ch = sc.next().charAt(0);
	
	if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		System.out.println("Given Alphabet is Vowel"+ch);
	}
	else
	{
		System.out.println("Given Alphabet is not the Vowel");	
	}	
	}
}