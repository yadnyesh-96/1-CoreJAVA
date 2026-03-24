

public class ExceptionNumberFormatAPP{
	public static void main(String x[]){
		try{
			String str ="abc123";
			int n = Integer.parseInt(str);
			System.out.println("Number is:"+n);
		}catch(NumberFormatException e){
			System.out.println("We can not be convert these directly");
		}
	}
}