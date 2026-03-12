


import java.util.*;
public class StringAPP{
	
	public static void main(String x[]){
		
		List<String> ls =new ArrayList<>();
		
		String str = "I Love India";
		
				//    I evoL aidnI 
		String str1="";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch !=' '){
				str1+=ch;
			}else{
				
				ls.add(str1);
				str1="";
			}
		}
		
		if (!str1.isEmpty()) {
			ls.add(str1);
		}
		
		for(String s : ls){
			System.out.print(revString(s)+" ");
		}
	}
	
	public static String revString(String str){
		String rev="";
		for(int i=str.length()-1; i>=0; i--){
			rev+=str.charAt(i);
		}
		return rev;
	}
}