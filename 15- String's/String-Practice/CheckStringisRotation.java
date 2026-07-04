/*52. Check whether one string is a rotation of another.*/

import java.util.Scanner;
class CheckStringisRotation
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2");
		String str2 = sc.nextLine();
		
		if(isRotation(str1,str2)){
			System.out.println("Strings are rotations of each other.");
        } 
		else {
            System.out.println("Strings are not rotations of each other.");
        }
	}
	public static boolean isRotation(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("Length is Not Same");
		}
		for(int i = 0 ; i < str1.length() ; i++)
		{
			String ans = str1.substring(i) + str1.substring(0,i);
			if(ans.equals(str2))
				return true;
		}
		return false;
	}
}