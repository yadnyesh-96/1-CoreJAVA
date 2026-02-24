

public class ToggleCaseAPP{
	
	public static void main(String x[]){
		
		String str = "Hello";
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			if(ch[i]>='A' && ch[i]<='Z'){
				ch[i]=(char)(ch[i]+32);
			}else if(ch[i]>='a' && ch[i]<='z'){
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		System.out.println(new String(ch));
	}
}

/*
if(Character.isUpperCase(ch[i])){
    ch[i] = Character.toLowerCase(ch[i]);
}
else if(Character.isLowerCase(ch[i])){
    ch[i] = Character.toUpperCase(ch[i]);
}
*/