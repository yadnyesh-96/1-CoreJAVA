import java.util.*;

public class CMContainsAll{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		Collection c=new ArrayList();
		c.add(10);
		c.add(20);
		
		boolean b=al.containsAll(c);
		if(b){
			System.out.println("Data Found");
		}else{
			System.out.println("Data Not Found");
		}
		
	}
}