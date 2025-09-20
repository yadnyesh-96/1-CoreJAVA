


public class RevNum{
	
	public static void main(String x[]){
		int num=123;
		rev(num);
		
	}
	
	public static void rev(int n){
		if(n==0){
			return;
		}
		System.out.printf("%d",n%10);
		rev(n/10);
	}
}