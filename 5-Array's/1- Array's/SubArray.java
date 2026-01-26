

public class SubArray{
	public static void main(String x[]){
		
		int a[]=new int[]{3,4,-7,1,3,3,1,-4};
		
		for(int i=0; i<a.length; i++){
			
			for(int j=i; j<a.length; j++){
				if((a[i]+a[j])==7){
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
}