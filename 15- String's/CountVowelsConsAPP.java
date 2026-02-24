
/*
Q2: Count Vowels and Consonants
Input: "programming"
Output:
Vowels = 3
Consonants = 8
*/

import java.util.*;
public class CountVowelsConsAPP{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in){
			String str = "programming";
			int v=0;c=0;
			for(char ch : str.toCharArray()){
				if(ch = 'a' || ch='e' || ch='i' || ch='o' || ch='u'){
					v++;
				}else{
					c++;
				}
			}
			
			System.out.println("Vowels = "+v+"\nConsonants = "+c);
		}
	}
}