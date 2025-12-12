import java.util.*;

public class CMAPPtoA{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		// these method is used to convert collection into array object
		Object obj[]=al.toArray();
		
		for(Object k:obj){
			System.out.println(k);
		}
			
		
	}
}