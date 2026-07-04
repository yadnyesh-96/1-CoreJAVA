/*53. Check whether a string is a pangram.*/

import java.util.Scanner;
class CheckPangram
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = sc.nextLine();
		isPangram(str1);		
	}
	public static void isPangram(String str1)
	{
		String s = str1.toLowerCase();
		int count = 0 ;
		boolean[] b = new boolean[26];
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				int index = ch - 'a';
				if(!b[index])
				{
					b[index] = true;
					count++;
				}
			}
		}
		if(count == 26)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
	}
}