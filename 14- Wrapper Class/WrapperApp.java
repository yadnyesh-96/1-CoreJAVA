

public class WrapperApp{
	public static void main(String x[]){
		try{
		String str="1234";
		int a=Integer.parseInt(str);
		
		System.out.println("a is :"+a);
		}catch(NumberFormatException ex){
			System.out.println("Error is:"+ex);
		}
	
	}
}