

public class countAllPairs{
	public static void main(String x[]){
		int a[] = new int[]{1,5,3,4,2};
		int k = 2;
		for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a.length; j++){
				if((a[j]-a[i]==k)||(a[i]-a[j])==k){
					System.out.println("["+a[i]+" "+a[j]+"]");
				}
			}
		}
	}
}