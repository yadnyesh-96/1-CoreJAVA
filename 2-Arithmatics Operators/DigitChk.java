// Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.

import java.util.*;
public class DigitChk{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	int num = ch;
	//System.out.println(num);
	String str = ((num >=33) && (num <=38) ) ? "Special Char" : ((num >= 65) && (num <=90)) || ((num>=97) && (num <=122))? "Alphabates" : "Not Alphabate" ;
	System.out.println(str);
	
	}
}

//A - 65
//Z - 90
//a-97
//z-122
//sp * 33 to 38