

import java.util.*;
public class CollectionAPP{
	public static void main(String x[]){
		
		List<Integer> ls = new ArrayList<>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(60);
		
		Enumeration e = ls.elements();
		
		while(i.hasMoreNext()){
			Object obj = i.nextElement();
			System.out.println(obj);
		}
		
	}
}