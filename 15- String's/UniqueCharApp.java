
import java.util.*;

public class UniqueCharApp{
	public static void main(String x[]){
		
		String str="banana";
		
		LinkedHashSet<Character> h=new LinkedHashSet<>();
		
		for(char c:str.toCharArray()){
			h.add(c);
		}
		
		System.out.println(h);
	}
}