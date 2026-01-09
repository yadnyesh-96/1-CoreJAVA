

public class ReverseString{
	
	public static void main(String x[]){
	
		String s="Good Morning";
		String s1="";
		for(int i=s.length(); i>=0; i--){
			s1+=s.charAt(i);
		}
	}	
}