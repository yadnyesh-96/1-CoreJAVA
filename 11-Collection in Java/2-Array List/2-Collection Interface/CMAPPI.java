import java.util.*;

public class CMAPPI{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		// iterator interface terator() used to fetch data
		Iterator i=al.iterator();
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
			
		
	}
}