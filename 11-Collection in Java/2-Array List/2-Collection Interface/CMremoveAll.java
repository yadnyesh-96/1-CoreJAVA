import java.util.*;

public class CMremoveAll{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		Collection c=new ArrayList();
		c.add(10);
		c.add(20);
		
		boolean b=al.removeAll(c);
		if(b){
			System.out.println("Data removed");
		}else{
			System.out.println("Data Not removed");
		}
		
		for(Object obj:al){
			System.out.println(obj);
		}
	}
}