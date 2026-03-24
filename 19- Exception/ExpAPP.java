
public class ExpAPP{
	
	public static void main(String x[])throws ArithmeticException
	{
		try{
		int res = 10/0;
		System.out.println(res);
		}catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
		}
	}
}