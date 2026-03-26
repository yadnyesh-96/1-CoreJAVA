

import java.util.*;
public class CollectionAPP{
	public static void main(String x[]){
		
		Vector<Integer> ls = new Vector<>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(60);
		
		Enumeration e = ls.elements();
		
		while(e.hasMoreElements()){
			Object obj = e.nextElement();
			System.out.println(obj);
		}
		
	}
}