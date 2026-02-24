
/*
Q4: Check Palindrome String
Input: "madam"
Output: Palindrome
*/

public class PalindromeAPP{
	
	public static void main(String x[]){
		
		String str = "madam";
		
		char ch[] = str.toCharArray();
		
		boolean flag=true;
		
		int start=0;
		int end=str.length()-1;
		
		while(start<end){
			if(ch[start]!=ch[end]){
				flag=false;
			}	
			
			start++;
			end--;
		}
		
		System.out.println(flag?"Palindrome":"No-Palindrome");
		
	}
}