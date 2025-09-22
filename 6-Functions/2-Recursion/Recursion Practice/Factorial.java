

public class Factorial{
	public static void main(String x[]){
	
		int n=5;
		System.out.println(Fac(n));
	}
	
	public static int Fac(int n){
	
		if(n==1 || n==0){
			return 1;
		}
		
		return n*Fac(n-1);
	}
}