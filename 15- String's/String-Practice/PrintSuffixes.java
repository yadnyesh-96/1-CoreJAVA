/*56. Print all suffixes of a string.*/

import java.util.Scanner;
class PrintSuffixes
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