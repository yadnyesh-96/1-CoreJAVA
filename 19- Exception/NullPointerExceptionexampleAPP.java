

public class NullPointerExceptionexampleAPP{
	public static void main(String x[]){
		try{
			int a[]=null;
			System.out.println(a.length);
		}catch(NullPointerException e){
			System.out.println("Data Not Found");
		}
	}
}