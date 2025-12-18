/*
Q1. Write a java program to find the unique value from array.
Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
All unique elements in the array are: 3, 20, 12, 10 
*/
class UniqueAPP{
	public static void main(String x[]){
		
		int a[]=new int[]{1,2,3,5,1,5,20,2,12,10};
		
		boolean[] visit=new boolean[a.length];
		System.out.print("[");
		for(int i=0; i<a.length; i++){
			if(visit[i])continue;
			int count=1;
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					count++;
					visit[j]=true;
				}
			}
			
			if(count==1){
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("]");
	}
}
