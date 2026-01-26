

public class TripletsWithZero{
	public static void main(String x[]){
		
		int a[]=new int[]{-1,0,1,2,-1,-4};
		int k=3;
		int sum=0;
		for(int i=0; i<k; i++){
			sum+=a[i];
		}
		if(sum==0){
			System.out.printf("(%d,%d,%d)",a[0],a[1],a[2]);
		}else{
			sum=0;
		}
		
		for(int i=k; i<a.length; i++){
			
			for(int j=i+1; j<k; j++){
				sum+=a[i]-a[j];
				System.out.print(sum);
			}
		}
		
	}
}