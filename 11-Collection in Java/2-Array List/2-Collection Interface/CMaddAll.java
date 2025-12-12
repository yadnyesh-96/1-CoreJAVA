import java.util.*;

public class CMaddAll{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		Collection c=new ArrayList();
		c.add(100);
		c.add(200);
		c.add(500);
		
		boolean b=al.addAll(c);
		if(b){
			System.out.println("Data Added");
		}else{
			System.out.println("Data Not Added");
		}
		
	}
}