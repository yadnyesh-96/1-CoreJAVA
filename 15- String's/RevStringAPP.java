
/*
Q3: Reverse a String (Manual, no built-in)
Input: "hello"
Output: "olleh"
*/

public class RevStringAPP{
	
	public static void rev(char ch[],int start,int len){
			
			while(start<len){
				
				char temp  = ch[start];
				ch[start] = ch[len];
				ch[len] = temp;
				
				start++;
				len--;
			}
	}
	
	public static void main(String x[]){
		
		String str = "hello";
		int len =str.length();
		char ch[] = str.toCharArray();
		int k=2;
		/*
		for(int i=len-1; i>=0; i--){
			char s = ch[i];
			System.out.print(s);
		}
		*/
		rev(ch,0,len-1);
		
		for(char s:ch){
			System.out.print(s);
		}
	}
}