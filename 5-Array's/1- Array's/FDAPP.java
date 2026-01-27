

import java.util.*;
public class FDAPP{
	public static void main(String x[]){
		
		int a[]=new int[]{10,20,30,40,10,20,30,50,60,70};
		
		LinkedHashMap map=new LinkedHashMap();
		for(int i=0; i<a.length; i++){
			
			Integer count = (Integer)map.get(a[i]);
			if(count==null){
				count =0;
			}
			++count;
			map.put(a[i],count);
		}
		
		System.out.println("Show Duplicate Values from array :");
		Set<Map.Entry> set =map.entrySet();
		for(Map.Entry m:set){
			//if((int)m.getValue()==1){
				System.out.println(m.getKey()+"\t"+m.getValue());
			//}
		}
	}
}