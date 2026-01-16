

public class vowelsAPP{
	public static void main(String x[]){
		
		String str="Programming";  //11
		int count=0;
		for(int i=0; i<str.length(); i++){
			char s=str.charAt(0);
			if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
				count ++;
			}
			
		}
		
		System.out.println("Total Vowels in Given String is:"+count);
	}
}	