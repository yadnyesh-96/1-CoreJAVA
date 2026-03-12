
import java.util.*;

public class NthLargestAPP{
	
	public static void main(String x[]){
		
		int arr[]={7,10,4,3,20,15};
					// 3 4 7 10 15 20
		int n=3;
		
		/*
		for(int i=0; i<=arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int V:arr){
			System.out.print(V+" ");
		}
		System.out.println("\n"+arr[arr.length-n]);
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int V:arr){
			pq.add(V);
			if(pq.size()>n){
				pq.poll();
			}
		}
		
		System.out.println(pq.peek());
	}
}