

import java.uitl.*;

Public class ArrayListAPP{
	
	public static void main(String x[]){
		
			List ls = new ArrayList();
			
			ls.add(20);
			ls.add(30);
			ls.add(50);
			ls.add(80);
			
			Iterator i = ls.iterator();
			while(i.hasNext(){
				
				Object obj = i.next();
				System.out.println(obj);
			}
	}
}