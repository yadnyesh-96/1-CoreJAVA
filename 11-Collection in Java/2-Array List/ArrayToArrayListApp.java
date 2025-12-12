
import java.util.*;
public class ArrayToArrayListApp{
	public static void main(String x[]){
		
		int[] a=new int[]{10,25,35,45,40,50};
		
		ArrayList al=new ArrayList();
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2!=0){
				al.add(a[i]);
			}
		}
		
		Iterator i= al.iterator();
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
	}
}