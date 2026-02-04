import java.util.*;

public class ListIAPP{
	
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		

		Iterator i=al.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
	}
}