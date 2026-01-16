

public class CHARAPP{
	public static void main(String x[]){
		
		String str="Programming";
		int count=0;
		for(int i=0; i<str.length(); i++){
			
			if(str.charAt(i) !=' '){
				count ++;
			}
			
		}
		
		System.out.println("Character's in Given String is:"+count);
	}
}	