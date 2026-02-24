

/*
Q7. Store words in an ArrayList. Print pairs of words that are anagrams without using sort(). 
Input: 
[listen, silent, cat, act, dog] 
Output: 
listen - silent 
cat - act 
Description: 
Compare character frequencies of two words manually.
*/
import java.util.*;
public class ListAnagramAPP{
	
	
	public static boolean isAnagram(String s1,String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		int f[]=new int[26];
		
		for(int i=0; i<s1.length(); i++){
			f[s1.charAt(i)-'a']++;
			f[s2.charAt(i)-'a']--;
		}
		
		for(int v:f){
			if(v!=0){
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static void main(String x[]){
		List<String> ls = new ArrayList<>();
		ls.add("listen");
		ls.add("silent");
		ls.add("cat");
		ls.add("act");
		ls.add("dog");
		
		for(int i=0; i<ls.size(); i++){
			for(int j=i+1; j<ls.size()-1; j++){
				if(isAnagram(ls.get(i),ls.get(j))){
					System.out.println(ls.get(i)+" - "+ls.get(j));
				}
			}
		}
	}
}