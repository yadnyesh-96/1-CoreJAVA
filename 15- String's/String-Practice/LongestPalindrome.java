/*58. Find the longest palindromic substring.
59. Find the shortest substring containing all characters of another string.
60. Find all palindromic substrings.*/

import java.util.Scanner;
class LongestPalindrome
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
		String longest = ""; 
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			for(int j = i ; j < str.length() ; j++)
			{
				String word = str.substring(i, j+1);	
				if(isPalindrome(word))
				{
					if(word.length() > longest.length())
						longest = word;
				}
			}
		}
		System.out.println("Longest : "+longest);		
	}
	public static boolean isPalindrome(String word)
	{
		String rev = ""; 
		for(int i = word.length()-1 ; i >= 0 ; i--)
		{
			rev = rev + word.charAt(i);
		}	
		if(word.equals(rev))
			return true;
		else
				return false;
	}
}