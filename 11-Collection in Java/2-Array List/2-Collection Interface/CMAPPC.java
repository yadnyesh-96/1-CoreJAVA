import java.util.*;

public class CMAPPC{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		
		//ensures the arraylist empty or not 
		boolean a=al.isEmpty();
		if(a){
			System.out.println("Is Empty");
		}else{
			System.out.println("Is not Empty");
		}
	}
}