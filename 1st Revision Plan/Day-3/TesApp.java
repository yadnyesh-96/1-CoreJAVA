public class TesApp{
	public static void main(String x[]){
		
		int a=10;
		int b=20;
		
		// int sum=a+b;  == 30
		int res=getAdd(a,b);  // function calling.
		
		System.out.println("Additiom"+res);
		
	}
	
	//Function definition .
	public static int getAdd(int num1, int num2){
		int sum=num1+num2;
		return sum;
	}
}