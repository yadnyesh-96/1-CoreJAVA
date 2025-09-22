

public class PrintSeries{

	public static void main(String x[]){
		int n=7;
		Ser(n);
	}
	
	public static void Ser(int n){
		if(n==0){
			return;
		}
		Ser(n-1);
		System.out.println(n);
	
	}
}