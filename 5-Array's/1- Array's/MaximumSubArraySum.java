

public class MaximumSubArraySum{
	
	public static void main(String x[]){
		
		int a[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		int sum=0;
		int maxSum=0;
		
		for(int i=0; i<a.length; i++){
			for(int j=i; j<a.length; j++){
				sum+=a[j];
				if(sum>maxSum){
					maxSum=sum;
					sum=0;
				}
			}
		}
		
		System.out.println("MaxSum is: "+maxSum);
	}
}