/*
Maximum Sum Subarray of Size K
Find the maximum sum of a subarray with size k.
*/


public class MaxSubarray{
	public static void main(String x[]){
		//Scanner sc=new Scanner(System.in);
		int k=3;
		int a[]=new int[]{2, 8, 5, 1, 3, 2};
					//	  0  1  2  3  4  5   
		int sum=0;
		
		//   a[0]=2;  a[k(3)]=1;  	
		for(int i=0;     i<k;     i++){
			
				sum+=a[i];  // 0+a[0]+a[1]+a[2] 0+2+8+5=15 sum=15;
		}
		
		int maxsum=sum;  // we strore the first window sum as maxsum =15;
		
		//  a[k(3)]=1   j end at pt len of arr 
		for(int j=k;    j<a.length;   j++){
		sum=sum+a[j]-a[j-k];  // 15+{(a[j]-->a[3]=1)}-{(a[j-k]-->a[3-3=0]=a[0]=2)}
							//   15    +   1  -   2 = sum --> 14
						
			if(sum>maxsum) // here we compare the sum it large than max sum 
			{ 
				maxsum=sum;  // then store the large value in maxsum variable;
			}
		
		}			
		
		System.out.println("Max Sum is :"+maxsum); // here we prints the max sum;
	}


}