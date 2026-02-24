
import java.util.*;
public class LongestWordArrayList{
	
	public static void main(String x[]){
		
		List<String>ls=new ArrayList<>();
		ls.add("cat");
		ls.add("elephant");
		ls.add("dog");
		ls.add("tiger");
		
		String longest = ls.get(0);
		
		for(int i=0; i<ls.size();i++){
			if(ls.get(i).length()>longest.length()){
				longest=ls.get(i);
			}
		}
		
		System.out.println(longest);
		
	}
}