/*51.Find the shortest word in a sentence.*/

import java.util.Scanner;
class FindShortestWord
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split(" ");
		int min = Integer.MAX_VALUE;
		String string = "";
		for(int i = 0 ; i < str.length ; i++)
		{
			if(str[i].length() < min)
			{
				min = str[i].length();
				string = str[i];
			}
		}
		System.out.println(string);
	}
}