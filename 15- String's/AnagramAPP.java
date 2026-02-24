

import java.util.*;
public class AnagramAPP{
	
	public static void main(String x[]){
		
		String s1="anagram";
		String s2="nagaram";
		
		int f[]=new int[26];
		
		boolean flag = true;
		
		if(s1.length()!=s2.length()){
			flag=false;
		}
		
		for(int i=0; i<s1.length(); i++){
			f[s1.charAt(i)-'a']++;
			f[s2.charAt(i)-'a']--;
		}
		
		for(int v:f){
			if(v!=0){
				flag=false;
			}
		}
		
		System.out.println(flag?"Anagram":"Not-Anagram");
	}
}