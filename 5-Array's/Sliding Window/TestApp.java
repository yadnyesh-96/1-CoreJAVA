

public class TestApp{
	public static void main(String x[]){
	
	int a[]=new int[]{2, 8, 5, 1, 3, 2};
	
	int sum=0;
	for(int i=0; i<k; i++){
		sum+=a[i];
	}
	
	int max=sum;
	int tem=0;
	for(int j=k; j<a.length; j++){
		
		sum+=a[j]-a[j-k];
		tem=sum;
	}
	
	}

}