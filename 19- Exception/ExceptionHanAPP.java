

public class ExceptionHanAPP{
	public static void main(String x[]){
		try{
			int res = 10/0;
			System.out.println("Result is :"+res);
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
	}
}