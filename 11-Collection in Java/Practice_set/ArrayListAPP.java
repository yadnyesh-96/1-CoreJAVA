

import java.util.*;

public class ArrayListAPP{
	
	public static void main(String x[]){
		
			List<Integer> v = new Vector<>();
			
			v.add(20);
			v.add(30);
			v.add(50);
			v.add(80);
			
			Iterator<Integer> i = v.iterator();
			
			int sum = 0;
			
			while(i.hasNext()){
				int num = i.next();
				sum = sum + num;
				System.out.println("\t"+num);
			}
			
			System.out.println("===================");
			System.out.println("SUM Is:"+sum);
	}
}