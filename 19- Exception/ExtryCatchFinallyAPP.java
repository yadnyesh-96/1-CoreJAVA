

public class ExtryCatchFinallyAPP{
	public static void main(String x[]){
		
		try{
			int res = 10/0;
			System.out.println("Result is:"+res);
		}catch(ArithmeticException e){
			System.out.println("We cannot divide by directly");
		}finally{
			System.out.println("We are in now the finallhy block");
			
			int a[]=new int[]{10,20,30,40,50,90};
			
			for(int V:a){
				System.out.println(" "+V);
			}
		}
	}
}