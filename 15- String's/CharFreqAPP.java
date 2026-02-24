

/*
Q5. Write a Java program that takes a string and stores each character with its frequency using
a Map.
Input
String: "programming"
Output : p → 1 r → 2 o → 1 g → 2 a → 1 m → 2 i → 1 n → 1

*/

import java.util.*;
public class CharFreqAPP{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Insert String Here:");
		String inp =sc.nextLine();
		
		Map<Character,Integer>map=new LinkedHashMap<>();
		
		for(char ch:inp.toLowerCase().toCharArray()){
			if(Character.isWhitespace(ch)) continue;
			
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch,1);
			}
		}
		
		
		for(Map.Entry<Character,Integer>res:map.entrySet()){
			System.out.println(res.getKey()+" --> "+res.getValue());
		}
	}
}	