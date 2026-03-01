
import java.util.*;
public class ArrayListToArray{
	public  static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		
		
		Object obj[]=al.toArray();
	
		for(Object k:obj){
			System.out.println(k);
		}
	}
}