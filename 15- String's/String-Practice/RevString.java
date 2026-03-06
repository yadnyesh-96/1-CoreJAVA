
public class RevString{
	
	public static void main(String x[]){
		
		String str = "coding";
		int len = str.length();
		
		char ch[]=str.toCharArray();
		
		for(int i=len-1; i>=0; i--){
			System.out.print(ch[i]);
		}
	}
}
