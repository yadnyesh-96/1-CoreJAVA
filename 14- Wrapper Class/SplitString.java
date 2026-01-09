
public class SplitString{
	public static void main(String x[]){
		
		String s="goodMoring";
		
		String s1="";
		
		for(int i=0; i<s.length(); i++){
			
			if(i==3){
				s1+=" ";	
			}
			
			s1+=s.charAt(i);
		}
		
		System.out.println(s);
	}
}