/*
7. First Negative Number in Every Window of Size K
Approach: Sliding Window with queue
Example: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3

*/

public class FirstNegNumWin{
	public static void main(String x[]){
		
		int a[]=new int[]{12,-1,-7,8,-15,30,16,28};
		
		int k=3;
		
		int n=0;
			
		System.out.print("\n[");
		for(int i=0; i<k; i++){
			System.out.print(a[i]+" ");
			if(n==0&&a[i]<0){
				n=a[i];
			}
		}
		
		System.out.print("] = "+n);
		n=0;
		
		for(int j=k; j<a.length; j++){
			
			//sum+=a[j]-a[j-k]
			
			System.out.print("\n[");
			n=0;
			//Display logic here 
			for(int i=j-k+1; i<=j; i++){
				System.out.print(a[i]+" ");
				if(a[i]<0){
					n=a[i];
				}
				
			}
			System.out.print("] = "+n);
		}
	}

}

