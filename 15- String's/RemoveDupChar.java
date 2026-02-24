/*
Q5: Remove Duplicate Characters Using Set
Input: "banana"
Output: "ban"
*/

import java.util.*;
public class RemoveDupChar{
	
	public static void main(String x[]){
		
		String str="banana";
		
		Set<Character>s = new LinkedHashSet<>();
		for(char c : str.toCharArray()){
			s.add(c);
		}
		
		for(char ch : s){
			System.out.print(ch);
		}
	}
}