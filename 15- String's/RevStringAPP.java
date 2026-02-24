
/*
Q3: Reverse a String (Manual, no built-in)
Input: "hello"
Output: "olleh"
*/

public class RevStringAPP{
	public static void main(String x[]){
		
		String str = "hello";
		int len =str.length();
		char ch[] = str.toCharArray();
		
		for(int i=len-1; i>=0; i--){
			char s = ch[i];
			System.out.print(s);
		}
	}
}