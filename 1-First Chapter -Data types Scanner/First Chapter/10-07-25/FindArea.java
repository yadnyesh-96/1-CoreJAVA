// write a java program to enter length and breadth of a rectangle and find its area 

public class FindArea{

 public static void main(String x[]){
 
	int len = Integer.parseInt(x[0]);
	int br = Integer.parseInt(x[1]);
	
	float a = len*br; 
	
	System.out.println("Area is :"+a);
	
 }
}