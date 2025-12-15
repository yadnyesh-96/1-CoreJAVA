// core concept of the instance variable 

class VAR{
	public int a=10;
	static int b=20;
	protected int c=30;
}

public class VARAPP{
	public static void main(String x[]){
		VAR v=new VAR();
		System.out.println(v.a);
		System.out.println(v.b);
		//System.out.println(v.c);
		System.out.println(VAR.b);
	}
}