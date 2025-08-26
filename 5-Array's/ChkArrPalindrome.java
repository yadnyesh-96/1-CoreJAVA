//Q10.Write a java program to check array is palindrome or not.


import java.util.*;
import java.util.Arrays;

public class ChkArrPalindrome{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[]{10,20,50,20,10};
		
		int start = 0;
		int end = arr.length - 1;
		boolean flag = true;
		
		while(start < end){
			if(arr[start] != arr[end]){
				flag = false;
				break;
			}
			start ++;
			end --;
		}
		
		System.out.println(flag ? "It's palindrome" : "Not palindrome");
		


		
		
	}

}