

public class CountAllPairs{
	public static void main(String x[]){
		
		int a[]=new int[]{1,5,3,4,2};
		
		for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a.length; j++){
				if((a[i]-a[j])==2 || (a[i]-a[j])==-2){
					System.out.println("["+a[i]+" "+a[j]+"]");
				}
			}
		}
	}
}