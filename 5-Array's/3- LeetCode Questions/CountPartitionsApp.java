

public class CountPartitionsApp{
	
	public int countPartitions(int[] nums){
		 int count=0,sum_a=0,sum_b=0;
        for(int i=0; i<nums.length; i++){
            sum_a+=nums[i];
            for(int j=i+1; j<nums.length; j++){
                sum_b+=nums[j];
                if((sum_a-sum_b)%2==0){
                    count=i;
                }
            }
        }

        return count;
	}
	
	public static void main(String x[]){
		
		int a[]=new int[]{10,10,3,7,6};
		
		int num=countPartitions(a);
		System.out.println(num);
	}
}