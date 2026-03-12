


public class SecondLargestAPP{
	
	public static void main(String x[]){
		
	int a[]=new int[] {10,5,20,8,15};
		
		for(int k :a){
			System.out.print(k+" ");
		}
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int V:a){
			
			if(V>first){
				second=first;
				first=V;
			}else if(V>second && V!=first){
				second=V;
			}
		}
		
		System.out.println("\n"+second);
	}
}