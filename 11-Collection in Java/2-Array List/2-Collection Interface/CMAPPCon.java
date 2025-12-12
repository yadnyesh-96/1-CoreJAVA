import java.util.*;

public class CMAPPCon{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		//these method is used to search the element in collection
		boolean a=al.contains(20); //true
		if(a){
			System.out.println("Data Found");
		}else{
			System.out.println("Data is not found");
		}
		
	}
}