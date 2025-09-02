/*
Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
Check if two strings are anagrams using sorting and comparing via two pointers.
*/

import java.util.*;
import java.util.Arrays;

public class AnagramApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String str1=sc.nextLine();
		System.out.println("Enter the second String: ");
		String str2=sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!= Str2.length()){
			System.out.println("Not Anagram");
			return;
		}
		
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		int i=0,j=0;
		boolean flag=true;
		
		while(i < arr1.length && j<arr2.length){
			if(arr1[i] != arr2[j]){
				flag=false;
				break;
			}
			i++;
			j++;
		}
		
		System.out.println((flag? "String are the Anagram" : "Not Anagram"));
	}

}