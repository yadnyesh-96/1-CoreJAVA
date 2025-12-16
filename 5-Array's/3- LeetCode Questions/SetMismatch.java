// Q.1 Set Mismatch 

public class SetMismatch{
	public static void main(String x[]){
		int a[]=new int[]{1,2,2,4};
		int n=a.length+1;
		int sum=0;
		
		System.out.print("\n[");
		for(int V:a){
			sum+=V;
			System.out.print(V+" ");
		}
		System.out.print("]\n");
		
		System.out.println("Length "+n);
		
		System.out.println("Sum is:"+sum);
		
		int m=n*(n+1)/2;
		System.out.println("Missing number is:"+(m-sum));
		
		boolean visit[]=new boolean[a.length];
		
		for(int i=0; i<a.length; i++){
			if (visit[i] )continue;
			
			int count =1;
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					count ++;
					visit[j]=true;
				}
			}
		
			System.out.println(a[i]+" = "+count);
		}
	}
}