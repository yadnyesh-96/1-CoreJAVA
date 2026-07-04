/*57. Find the longest substring without repeating characters.
58. Find the longest palindromic substring.
59. Find the shortest substring containing all characters of another string.
60. Find all palindromic substrings.*/

/*56. Print all suffixes of a string.*/

import java.util.Scanner;
class LongestSubstringWithoutRepearChar
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			for(int j = i ; j < str.length() ; j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}