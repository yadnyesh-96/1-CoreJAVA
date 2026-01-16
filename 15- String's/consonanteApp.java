

public class consonanteApp{
	public static void main(String x[]){
		
		String str="Computer";
		int count =0;
		for(char c:str.toLowerCase().toCharArray()){
			if(c>="a" && c<="z" && "aeiou".indexOf(c) == -1){
				count++;
			}
		}
		
		System.out.println("Total Consonant:"+count);
	}
}