/*
Find First Negative Number in Every Window of Size K
For each window of size k, find the first negative number.
Array: [-8, 2, 3, -6, 10]
Window size (k) = 2
*/


public class chekNegNum{
	public static void main(String x[]){
		int a[]=new int[]{-8, 2, 3, -6, 10};
		int k=2;
		int sum=0;
		boolean flag=false;
		for(int m=0; m<k; m++){
			if(sum<=a[m]){
			System.out.println(a[m]);
				
			}
		}
		
	}
}

