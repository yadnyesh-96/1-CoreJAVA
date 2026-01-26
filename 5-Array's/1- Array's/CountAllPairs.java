

public class CountAllPairs{
	public static void main(String x[]){
		
		int a[]=new int[]{1,5,3,4,2};
		
		for(int i=0; i<a.length; i++){
			int k=2;
			
			for(int j=0; j<a.length; j++){
				if((a[i]-a[j])==k){
					System.out.println("["+a[i]+","+a[j]+"]");
				}
			}
		}
	}
}