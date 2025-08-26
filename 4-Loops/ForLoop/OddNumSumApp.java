// 8. Write a C program to find sum of all odd numbers between 1 to n.

public class OddNumSumApp{
	
	public static void main(String x[]){
		int sum=0;
		for(int i=1; i<=100; i++){
			
			if(i%2!=0){
			sum=sum+i;
			}
		
		}
		System.out.println(sum);
	}
}