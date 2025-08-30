//1.Write program to input two values using command line argument and perform its swapping?


public class OneInputCommandLine{

	public static void main(String x[]){
		
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		System.out.println("a:="+a+" b:="+b);
		 a=a+b;  // 10+20=30
		 b=a-b;  // 30-20=10 --> b=10.
		 a=a-b;  // 30-10=20 --> a=20.
		 
		System.out.println("a:="+a);
		System.out.println("b:="+b);
		
	}

}