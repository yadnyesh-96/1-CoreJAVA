

/*
Q8. tore N words in a HashMap. Group all anagrams together without using sort(). 
Input: 6 
listen , silent , cat , act , dog , god 
Output: 
Anagram Groups: 
listen silent 
cat act 
dog god 
Description: 
Store the given words in a HashMap. 
 
Do not use: 
• Arrays.sort() 
• Collections.sort() 
• Any built-in anagram checking methods 
Finally, traverse the Map and print groups containing more than one word.
*/

import java.util.*;
public class HashMapWordAPP{
	
	static boolean isAnagram(String s1,String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		int f[]=new int[256];
		
		for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
		
		for(int v:f){
			if(v!=0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		Map<Integer,String> map=new LinkedHashMap<>();
		System.out.println("How Many Words want to store ?");
		int size=sc.nextInt();
		System.out.println("Store Words :");
		for(int i=1; i<=size; i++){
			map.put(i, sc.nextLine());
		}
		
		System.out.println(map);
	}
}