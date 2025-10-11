/*
10. Minimum Size Subarray with Sum ≥ Target

Approach: Sliding Window
Example: arr = [2,3,1,2,4,3], target = 7 → Length: 2 ([4,3])
*/

public class MinSubAvg{
	public static void main(String x[]){
	
		int a[]=new int[]{2,3,1,2,4,3};
			
			int start=0,sum=0,target=7,len=Integer.MAX_VALUE;
		
		for(int end=0; end<a.length; end++){
			
			sum+=a[end];
			
			while(sum>=target){
				
				int Len=end-start+1;
				if(Len<len){
					len=Len;
				}
				sum-=a[start];
				start++;
			}
		}
		
		System.out.println("Length --> "+len);
	}
}