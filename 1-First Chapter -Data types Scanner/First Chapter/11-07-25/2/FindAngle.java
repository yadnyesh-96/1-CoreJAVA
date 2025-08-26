/* Q4. Write a java program to enter two angles of a triangle and find the third angle. 

a=52, b=68, c=?; to find c angle let consider x ;
sum of the angles =180;
52 + 68 + x = 180;

120 + x = 180;

x=180-120;

x = 60;

c = 60;
*/


public class FindAngle{

	public static void main(String x[]){
	
	int a = Integer.parseInt(x[0]);
	int b = Integer.parseInt(x[1]);
	
	int c = (180 - (a+b));
	
	System.out.println( c);
	}
}