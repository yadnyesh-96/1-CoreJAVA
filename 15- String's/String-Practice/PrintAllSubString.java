/*54. Print all substrings of a string.*/

import java.util.Scanner;
class PrintAllSubString
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
	
		for(int i = 0 ; i < str.length() ; i++)
		{
			String s = "";
			for(int j = i ; j < str.length() ; j++)
			{
				s += str.charAt(j);
				System.out.println(s);
			}
		}
	}
}