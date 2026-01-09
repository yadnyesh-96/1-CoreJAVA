

public class TrimString{
	public static void main(String x[]){
		String s = "   Good Morning   ";
		
		int start=0;
		int end=s.length()-1;
		
		while(start<=end && s.charAt(start)==' '){
			start++;
		}
		
		while(end>=start && s.charAt(end)==' '){
			end--;
		}
		
		String t="";
		
		for(int i=start; i<=end; i++){
			t+=s.charAt(i);
		}
		
		System.out.println("["+t+"]");
	}
}