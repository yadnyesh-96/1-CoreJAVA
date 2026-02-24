
/*
Q6: First Non-Repeating Character
Input: "swiss"
Output: w
*/

import java.util.*;
public class NonReaptAPP{
	public static void main(String x[]){
		
		String str = "swiss";
		char ch[] = str.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(char c :ch){
			if(Character.isWhitespace(c))continue;
			
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}else{
				map.put(c,1);
			}
		}
		
		for(Map.Entry<Character,Integer>res:map.entrySet()){
			if(res.getValue()==1){
				System.out.println(res.getKey());
				break;
			}
		}
	}
}