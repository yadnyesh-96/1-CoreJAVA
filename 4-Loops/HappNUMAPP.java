

public class HappNUMAPP{
	public static void main(String x[]){
		
		int n = 19;
		int sum =0;
		while(n!=0){
			int rem = n % 10;
			sum += rem * rem;
			getCheck(sum);
			n = n / 10;
		}
	}
	
	public static boolean getCheck(int n){
		int sum=0;
		while(n!=0){
			int rem = n % 10;
			sum += rem * rem;
			n = n / 10;
		}
		
		if(sum==1){
			return true;
		}else{
			getCheck(sum);
		}
		
	}
}