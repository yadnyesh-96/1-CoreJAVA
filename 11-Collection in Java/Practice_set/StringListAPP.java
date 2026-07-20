
import java.util.*;

public class StringListAPP{
	public static void main(String x[]){
		
		ArrayList<String> ls = new ArrayList<>();
		
		ls.add("Python");
		ls.add("Java");
		ls.add(".NET");
		ls.add("C-Programming");
		ls.add("C++ Programming");
		
		ListIterator<String> i = ls.listIterator();
		
		System.out.println("Display list in Forward:");
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
			System.out.println("------------------------------------");
		System.out.println("Display List in Backward:");
		while(i.hasPrevious()){
			System.out.println(i.previous());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Sub List");
		List<String> sub = ls.subList(1,4);
		System.out.println(sub);
		
	
	}
	
}