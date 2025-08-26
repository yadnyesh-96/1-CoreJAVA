//Q56. Given (x, y), print quadrant I, II, III, IV or "Axis".


import java.util.*;
public class PrintQuadrant{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X axis valye:");
	int a = sc.nextInt();
	System.out.println("Enter the y axis value :");
	int y = sc.nextInt();
	
	String str = ((a>0)&&(y>0)) ? "I quadrant" : ((a<0)&&(y>0)) ? "II quadarant" : ((y<0)&&(a<0))? "III quadarant" :((a<0)&&(y>0)) ? "IV quadarant" : "Invalid" ;
	System.out.println(str);
	}

}