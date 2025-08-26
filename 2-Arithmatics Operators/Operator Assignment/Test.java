
import java.util.*;
public class Test{

		public static void main(String x[]){
			Scanner sc = new Scanner(System.in);
		/*
		Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
 
		Example
		Input a: 8 ,  b: -4 , c: -2
		Output Root1: 0.80
		Root2: -0.30
		*/
			
			System.out.println("Enter the three numbers:");
			System.out.println("a:");
			int a = sc.nextInt();
			System.out.println("b:");
			int b = sc.nextInt();
			System.out.println("c:");
			int c = sc.nextInt(); 
			double D = (b*b)-(4*a)*c; // 
			 System.out.println("------------------------------");
			
			
				double D1 = Math.sqrt(D);
		
			if(D>0){
				System.out.println("Root are Real and Distinct");
				double a1 = (-(b))+D1;
				double a2 =2*a;
				double a3 = a1/a2;
				System.out.println("Root 1: "+a3);
				
				double b1 = (-(b))-D1;
				double b2 = b1/a2;
				System.out.println("Root 2: "+b2);
				
			}else if(D<0){
				double c1=(-(b));
				double c2=2*a;
				double c3=c1/c2;
			
				double c4 = (-D1)/c2;
				System.out.println("Root are complex and imaginary");
				System.out.println("Root 1: "+(c3+c4));
				System.out.println("Root 2: "+(c3-c4));
			}else{
				double d = 2*a;
				double d1 = (-b)/d;
				System.out.println("Root are Real & Equal : "+d1);
			}
		
		
		}
		
		

}