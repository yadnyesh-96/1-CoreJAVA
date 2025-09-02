/*
Minimum Sum Subarray of Size K
Find the minimum sum of a subarray with size k.
*/

public class Minsubarray{
	public static void main(String x[]){
		int k=3;
		
		int a[]=new int[]{1, 0, 3, 1, 3, 2};
		
		int sum=0;
		
		for(int i=0; i<k; i++){
			sum+=a[i];
		}
		
		int min=sum;
		
		for(int j=k; j<a.length; j++){
			/*
			System.out.printf("window %d",(j-k+2),":");
			for(int m=(j-k+1); m<j; m++){
				System.out.printf("%d \t",a[m]);
			}
			*/
			sum+=a[j]-a[j-k];
			if(sum<min){
				min=sum;
			}
		}
		
		System.out.println(min);
	}
}