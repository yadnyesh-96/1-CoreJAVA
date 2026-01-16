

public class WordMaximumLen{
	
	public static void main(String x[]){
		
		String str="Java is Very powerfull";
		
		String maxword="";
		String current="";
		
		for(int i=0; i<str.length(); i++){
			
			char ch=str.charAt(i);
			
			if(ch!= ' '){
				current+=ch;
			}else{
				if(current.length()>maxword.length()){
					maxword=current;
				}
				current="";
			}
		}
		
		if(current.length()>maxword.length()){
					maxword=current;
		}
		
		System.out.println(maxword);
	}
}