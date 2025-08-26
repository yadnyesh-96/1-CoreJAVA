//Write a java program to calculate area if an equilateral triangle. (√3 a2/ 4)

public class AreApp{

	public static void main(String x[]){
	
	int a=Integer.parseInt(x[0]); // area of equilateral triangle 
	float b=1.732050808f;
	double c= b/4;
	double d= c*(Math.pow(a,2));
	
	System.out.println("Area of equilateral triangle:"+ d);
	
		
	}
}