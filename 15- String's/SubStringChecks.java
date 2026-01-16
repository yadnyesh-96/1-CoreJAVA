

public class SubStringChecks{
	
	public static void main(String x[]){
		
		String s="Java Collections";
		String s1="Java";
		
		String[] str=s.split(" ");
		
		HashSet<String> set = new HashSet<>();
		
		for(String word:str){
			set.add(word);
		}
		
		if(set.contains(s1)){
			System.out.println("Sub String Found");
		}else{
			System.out.println("SubString is not found");
		}
	}
}