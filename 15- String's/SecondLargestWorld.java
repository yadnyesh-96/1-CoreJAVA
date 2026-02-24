
import java.util.*;

public class SecondLargestWorld{
	
	public static void main(String x[]){
		
		List<String>ls = new ArrayList<>();
		ls.add("cat");
		ls.add("elephant");
		ls.add("dog");
		ls.add("tiger");
		
		String longest = "";
		String secondLongest = "";
		
		for(String str : ls){
			if(str.length()>longest.length()){
				secondLongest = longest;
				longest=str;
			}else if(str.length()>secondLongest.length() && !str.equals(longest)){
				secondLongest=str;
			}
		}
		System.out.println(secondLongest);
	}
}