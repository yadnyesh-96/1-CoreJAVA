import java.util.*;

public class IiHasNextApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator i=al.iterator();  // iterator interface class 
								// method iterator() overrride here


		while(i.hasNext()){    // hasNext() method to check element in collection
			Object obj=i.next();   // next() fetch data from collection
			System.out.println(obj); // prints
			
		}
	}
}
