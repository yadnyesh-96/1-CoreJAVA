import java.util.*;

public class ListIAPP{
	
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator i=al.Iterator()
		
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
	}
}