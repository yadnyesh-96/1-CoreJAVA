

import java.util.*;
public class CMAPP{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(40);
		
		
		// check's the sixe of collection 
		int size=al.size();
		System.out.println(size);
		
		
		//Ensure the arraylist empty or not
		
		boolean a=al.isEmpty();
		if(a){ System.out.println("Array List is Empty");
		}else{System.out.println("Array list is not Empty");}
		
		
	}
}