
import java.util.*;
public class CharacterAppears{
	
	public static void main(String x[]){
		
		String s="programming";
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(char c:s.toCharArray()){
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}else{
				map.put(c,1);
			}
		}
		
		System.out.println(map);
	}
}