

public class AnagramAPP{	
	
	public static void main(String x[]){
		
		String str = "listen";
		String str1 = "silent";
		
		int f[]=new int[26];
		
		boolean flag = true;
		
		if(str.length()!=str1.length()){
			flag = false;
		}
		
		for(int i=0; i<str.length(); i++){
			f[str.charAt(i)-'a']++;
			f[str1.charAt(i)-'a']--;
		}
		
		for(int V:f){
			if(V!=0){
				flag=false;
			}
		}
		
		System.out.println(flag?"Anagram":"not-anagram");
		
	}
}