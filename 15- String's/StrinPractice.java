

import java.util.*;
public class StrinPractice{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Insert the Input:");
		String inp=sc.nextLine();
		
		int len=0;
		for(char ch : inp.toCharArray()){
			if(Character.isWhitespace(ch))continue;
			len++;
		}
		
		System.out.println(len);
	}
}