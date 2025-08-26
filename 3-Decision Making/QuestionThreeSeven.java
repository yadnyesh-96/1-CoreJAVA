/*
Q37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.
        	
*/

import java.util.*;
public class QuestionThreeSeven{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month (1-12):");
		int num = sc.nextInt();
		
		if (num ==12 || num==1 || num==2 || num==3){
			System.out.println("Winter");
		}else if(num==4 || num==5 || num==6){
			System.out.println("Summer");
		}else if(num==7 || num==8 || num==9 || num==10 || num==11){
			System.out.println("Mansoon");
		}
	
	
	}

}