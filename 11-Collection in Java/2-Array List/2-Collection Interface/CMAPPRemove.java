import java.util.*;

public class CMAPPRemove{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		// these method used to remove element from collection if removed //return true otherwise false.
		boolean a=al.remove(Integer.valueOf(30));
		if(a){
			System.out.println("Element Removed");
		}else{
			System.out.println("Element not Removed");
		}
		
		Iterator i=al.iterator();
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
		
	}
}