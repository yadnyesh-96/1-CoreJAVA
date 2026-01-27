
import java.util.*;

public class KthLargestEelAPP{
	public static void main(String x[]){
			
			int a[]=new int[]{7, 10, 4, 3, 20, 15};
			
			int k=2;
			
			PrioirityQueue<Integer> pq=new PrioirityQueue();
			
			for(int num:a){
				pq.add(num);
				if(pq.size()>k){
					pq.poll();
				}
			}
			
			System.out.println("K th Largest Element is:"+pq.peek());
		
	}
}	