
public class RecAPP{
	
	static int Pow(int base,int ind){
		if(n==0){
			return n;
		}
		
		return base*Pow(base,ind-1);
	}
	
	
	public static void main(String x[]){
		
		
		int res=Pow(2,3);
		
		System.out.println("Power:"+res);
		
	}
}