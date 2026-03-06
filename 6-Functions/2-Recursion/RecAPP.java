
public class RecAPP{
	
	static int fac(int n){
		if(n==0){
			return 1;
		}
		
		return n*fac(n-1);
	}
	
	
	public static void main(String x[]){
		
		
		int res=fac(5);
		
		System.out.println("factorial:"+res);
		
	}
}