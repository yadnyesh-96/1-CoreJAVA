
import java.util.*;
public class CollectionSetAPP{
	public static void main(String x[]){
		
		Set<Integer> s = new TreeSet<>();
		
		s.add(10);
		s.add(20);
		s.add(40);
		s.add(30);
		s.add(60);
		s.add(50);
		
		Iterator i=s.iterator();
		while(i.hasNext()){
			Object obj = i.next();
			System.out.println(obj);
		}
	}
}