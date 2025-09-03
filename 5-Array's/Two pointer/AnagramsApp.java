/*
Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
Check if two strings are anagrams using sorting and comparing via two pointers.
*/

import java.util.*;
import java.util.Arrays;
public class AnagramsApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the first string:");
		String str1=sc.nextLine();
		System.out.println("Enter the second string:");
		String str2=sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length() != str2.length()){
			System.out.println("Not Anagram");
			return;
		}
		
		char[] a =str1.toCharArray();
		char[] b =str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0;
		boolean flag = true;
		
		while( i<a.length && j<a.length){
			if(a[i]!=b[j]){
				flag=false;
				break;
			}
			
			i++;
			j++;
		}
		
		if(flag){
			System.out.println("String is Anagram");
		}else{
			System.out.println("Not Anagram");
		}
	}

}