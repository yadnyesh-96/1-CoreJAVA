// write a java program to enter radius of a circle and find its diameter, area and circumference 
// formula - diameter = 2*radius; circumference - 2*3.14*radius; 
// area-3.14*radius*radius;

import java.util.*;
public class Circle{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius of a circle:");
	
	int rad = sc.nextInt();
	float dia = (2*rad);
	float cir = ((2*3.14f)*rad);
	
	System.out.println("Radius of circle:"+rad);
	System.out.println("Diameter of a circle:"+dia);
	System.out.println("Circumference of a circle:"+cir);
	}

}
