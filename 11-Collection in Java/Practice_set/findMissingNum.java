

public class findMissingNum{
	public static void main(String x[]){
		
		int[] arr = {1, 2, 4, 5};
		int n = 5;
		
		/*
		int exceptSum = n*(n+1)/2;
		int sum = 0;
		for(int i:arr){
			sum+=i;
		}
		
		System.out.println("Missing Number is:"+(exceptSum-sum));
		*/
		
		int xor = 0;
		for(int i=1; i<=n; i++){
			xor^=i;
		}
		
		for(int num : arr){
			xor^=num;
		}
		
		System.out.println("Missing Number is:"+xor);
	}
}