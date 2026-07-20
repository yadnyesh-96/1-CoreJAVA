

public class maxSumAPP{
	public static void main(String x[]){
		int a[] =new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum = 0;
		int start = 0;
		int end = 0;
		
		for(int i=0; i<a.length; i++){
			int sum=0;
			for(int j=i; j<a.length; j++){
				sum+=a[j];
				
				System.out.print("[");
				for(int k=i; k<=j; k++){
					System.out.print(a[k]+" ");
				}
				System.out.print("] = "+sum+"\n");
								
				if(sum>maxSum){
					maxSum=sum;
					start = i;
					end = j;
				}
				
			}
		}
		
		System.out.print("[");
		for(int i=start; i<=end; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("] :"+maxSum);
	}
}