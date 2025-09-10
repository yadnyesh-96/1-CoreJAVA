//Write a program to find the sum of first n natural numbers using recursion

public class SumNaturalNumrecursion{
		public static void main(String x[]){
			
			int num=100;
			System.out.println(SumNat(num));
		}
		
		public static int SumNat(int n){
			
			if(n==0){
				return 0;
			}else{
				return n+SumNat(n-1);
			}
		}

}