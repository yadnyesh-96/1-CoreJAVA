

public class AssertApp{
	public static void main(String x[]){
		int age = -5;

		assert age>=0 : "Age cannot be negative";
		
		System.out.println("Program Continue");
	}
}