/*55. Print all prefixes of a string.*/
	
import java.util.Scanner;
class PrintPrefixes
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
	
		String s = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			s += str.charAt(i);
				System.out.println(s);
		}
	}
}