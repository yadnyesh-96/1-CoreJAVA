//Write a program to calculate the power of a number (x^n) using recuo

public class PowRecursionfun{
	public static void main(String x[]){
	
		int num=10;
		int b=2;
		System.out.println(pow(num,b));
	}
	
	public static int pow(int a, int b){
		if(a==0|| b==0){
			return 1;
		}else{
			return a*pow(a,b-1);
		}
	}
}