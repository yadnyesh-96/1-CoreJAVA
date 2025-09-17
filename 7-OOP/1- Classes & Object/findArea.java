/*
10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.


For Area: Use A = πr² if you have the radius, or A = π(d/2)² if you have the diameter. 
For Circumference: Use C = 2πr if you have the radius, or C = πd if you have the diameter. 
*/

import java.util.*;
public class findArea{
	public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			double num=sc.nextDouble();
			CircleArea a=new CircleArea();
			double res=a.areafind(num);
			System.out.println("Area of Circle:"+res);
	}

}

class CircleArea{
		
		double areafind(double r){
			double A=3.14*(r*r);
			return A;
		}
}


