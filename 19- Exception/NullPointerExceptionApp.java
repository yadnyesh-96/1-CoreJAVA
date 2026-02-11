
public class NullPointerExceptionApp{
	static int a[];
	public static void main(String x[]){
		try{
			a[0]=100;
	
		}catch(Exception ex){
			System.out.println("Error is :"+ex);
		}
	}
}