/* 
 Write a Java program that reads a number and display the cube.
*/

import java.util.*;
public class CubeNumber{
	
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num1 = sc.nextInt();
	double cub = Math.pow(num1,3);
	System.out.println("Cube of Given Number:"+cub);
	}
}