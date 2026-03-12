

import java.util.*;
public class Non-RepaeatingCharAPP{
	public static void main(String str[]){
		
		String str = "swiss";
		char ch[]=str.tocharArray();
		
		Map<Character,Integer> map =new LinkedHashMap<>()
		
		for(char c : ch){
			
			if(map.contains(c)){
				map.put(c,map.get(c)+1);
			}else{
				map.put(c,1);
			}
		}
		
		for(Map.Entry<Character,Integer> res :map.entrySet()){
			if(res.getValue()==1){
				System.out.println(res.getKey());
				break;
			}
		}
	}
}