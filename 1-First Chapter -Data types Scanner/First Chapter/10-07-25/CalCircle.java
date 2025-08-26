// write a java program to enter radius of a circle and find its diameter, area and circumference 
// formula - diameter = 2*radius; circumference - 2*3.14*radius; 
// area-3.14*radius*radius;

public class CalCircle{

	public static void main(String x[]){
	int rad=Integer.parseInt(x[0]);
	int dia=(2*rad);
	double cir=(2*3.14)*rad;
	double are=(3.14*rad)*rad;
	
	System.out.println("Diameter of circle:"+dia);
	System.out.println("Circumference of circle:"+cir);
	System.out.println("Area of Circle:"+are);
	
	}

}