// write a java program swap two numbers uing third variable.

public class SwapApp{

	public static void main(String x[]){
	
	int a =Integer.parseInt(x[0]);
	int b =Integer.parseInt(x[1]);
	int c =a;
	a=b;
	b=c;
	System.out.println("a="+a);
	System.out.println("b="+b);
	}
}