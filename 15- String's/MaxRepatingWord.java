

/*
Q8. Write a java program to find the first repeating word in a sentence. 
Input 
Sentence: "this is a test this is simple" 
Output 
First Repeating Word: this 
Description : 
Manually extract words without split(). Store words in HashMap and find the first word whose 
frequency
*/

import java.util.*;
public class MaxRepatingWord{
	
	public static void main(String x[]){
		Map<String,Integer>map=new LinkedHashMap<>();
		
		String sentence = "this is a test this is simple" ;
		
		String str="";
		
		for(int i=0; i<sentence.length(); i++){
			
			char ch = sentence.charAt(i);
			if(ch!=' '){
				str+=ch;
			}else{
				if(map.containsKey(str)){
					System.out.println("First Repeating word: "+str);
					return;
				}else{
					map.put(str,1);
				}
				
				str = "";
			}
		}
		
		if(map.containsKey(str)){
			System.out.println("First Repeating word: "+str);
		}
	}
}