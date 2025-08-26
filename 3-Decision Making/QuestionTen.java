//Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.

import java.util.*;
public class QuestionTen{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input from keyboard");
	char ch = sc.next().charAt(0);
	//int ch = ch1;
	if ((ch>65 && ch<90) || (ch<97 && ch>122)){
		System.out.println("Alphabates");
		
	}else if((ch>=48 && ch<=57)|| (ch<0 && ch>=9)){
		System.out.println("Digit");
	}else if(ch<=33 && ch>38){
		System.out.println("Special Character");
	}else{
			System.out.println("Invailid input");
	}	
	}
}

//A - 65
//Z - 90
//a-97
//z-122
//digit = 48 to 57 
//sp = 33 to 38