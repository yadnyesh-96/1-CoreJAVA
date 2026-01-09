
public class StringApp{
	public static void main(String x[]){
	
		String str="good morning";
		
		/*String str2=str.toUpperCase();
		System.out.println(str2);
		*/
		
		String str2="";
		
		for(int i=0; i<str.length(); i++){
				
			char ch =str.charAt(i);
			if(ch>='a' && ch<='z'){
				str2+=(char)(ch-32);
			}else{
				str2+=ch;
			}
		}
		
		System.out.println(str2);
	}
}