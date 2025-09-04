/*
Maximum Sum Subarray of Size K
Find the maximum sum of a subarray with size k.
*/

public class MaxSumSatArray{

	public static void main(String x[]){
	//                         k
	int a[]=new int[]{2, 1, 5, 1, 3, 2};
	//                0  1  2  3  4  5 
	
	int k=3;
	int sum=0;
	
	for(int m=0; m<k; m++){
		sum+=a[m];  // 2+1+5=8 =sum.
	}
	
	int max=sum;
	boolean flag=false;
	
	for(int i=k; i<a.length; i++){
		
 		sum+=a[i]-a[i-k];    // sum(8)+1-2=7 ==> (7)+3-1=9 
		System.out.println("a:="+a[i]+" / "+a[i-k]);
		if(sum>max){  
			max=sum;
			flag=true;
		}
	}
	
	if(flag){
		System.out.println(max);
	}
	
	}
}