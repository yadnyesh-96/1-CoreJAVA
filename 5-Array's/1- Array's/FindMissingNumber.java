

public class FindMissingNumber{
	public static void main(String x[]){
		int a[]=new int[]{2,3,4,5};
		
		int n=a.length+1;
		
		int sum=0;
		
		for(int v:a){
			sum+=v;
		}
		
		int expSum=n*(n+1)/2;
		
		System.out.println("Missing Number is:"+(expSum-sum));
	}
}	