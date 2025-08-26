/* 
Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	   
*/

import java.util.*;
public class QuestionTwoSeven{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student Name:");
	String str = sc.nextLine();
	System.out.println("Enter the Marks out of 100 :");
	System.out.println("\n 1.Physics \n 2.Chemistry \n 3.Biology \n 4.Mathematics \n 5.Computer");
	double sub1 = sc.nextDouble();
	double sub2 = sc.nextDouble();
	double sub3 = sc.nextDouble();
	double sub4 = sc.nextDouble();
	double sub5 = sc.nextDouble();
	
	double sum = sub1+sub2+sub3+sub4+sub5;
	double per = ((sum/500)*100);
	System.out.println(per);
	
	if (per >= 90.0 ){
		System.out.println("Grade A");
	}else if( per >= 80.0){
		System.out.println("Grade B");
	}else if( per >= 70.0){
		System.out.println("Grade C");
	}else if( per >= 60.0){
		System.out.println("Grade D");
	}else if( per >= 40.0){
		System.out.println("Grade E");
	}else{
		System.out.println("Grade F");
	}
	}

}