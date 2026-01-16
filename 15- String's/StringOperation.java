
public class StringOperation{
	
	public static void isPalindrome(String str){
		int n=str.length()-1;
		int i=0;
		boolean flag=true;
		
		while(i<=n){
			char s=str.charAt(i);
			char m=str.charAt(n);
			
			if(s!=m){
				flag=false;
				break;
			}
			i++;
			n--;
		}
		
		if(flag){
			  System.out.println("Palindrome");
		}else{
			  System.out.println("Not Palindrome");
		}
	}
	
	public static void CountWords(String str){
		str=str.trim();
		int count=0;
		if(str.isEmpty()){	
			System.out.println("Total Words: 0");
			return;
		}
		
		for(char c:str.toCharArray()){
			if(c==' '){
				count++;
			}
		}
		
		System.out.println("Total words:"+(count+1));
	}
	
	public static void main(String x[]){
		
		String str="madam";
		
		isPalindrome(str);
		CountWords(str);
	}
}