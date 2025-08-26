//Write a java program swap two number without using third variable. 

public class SwapTwo{

	public static void main(String x[]){
	int a = 10, b = 5;
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println(a);
	System.out.println(b);
	}
}