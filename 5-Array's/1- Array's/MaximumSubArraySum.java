

public class MaximumSubArraySum{
	
	public static void main(String x[]){
		
		int a[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		
		int maxSum=0;
		
		int start=0,end=0;
		for(int i=0; i<a.length; i++){
			
			int sum=0;
			//int tempstart=i;
			for(int j=i; j<a.length; j++){
				sum+=a[j];
				if(sum>maxSum){
					maxSum=sum;
					start=i;
					end=j;
				}
			}
		}
		
		System.out.println("MaxSum is: "+maxSum);
		System.out.println("Subarray is:");
		for(int k=start; k<=end; k++){
			System.out.print(" "+a[k]);
		}
	}
}