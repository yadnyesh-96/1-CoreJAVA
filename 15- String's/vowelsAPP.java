

public class vowelsAPP{
	public static void main(String x[]){
		
		String str="Education";  //11
		int count=0;
		
		/*
		for(int i=0; i<str.length(); i++){
			char s=str.charAt(i);
			if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'|| s=='A' || s=='E' || s=='I' || s=='O' || s=='U'){
				count ++;
			}
			
		}
		*/
		
		for(char c : str.toLowerCase().toCharArray()){
			if("aeiou".indexOf(c) !=-1){
				count++;
			}
		}
		
		System.out.println("Total Vowels in Given String is:"+count);
	}
}	