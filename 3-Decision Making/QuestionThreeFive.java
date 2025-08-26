/*
Q35. Check if a person is a child 0-12, teenager13-19, adult20, or senior60 based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
	*/
	
import java.util.*;
public class QuestionThreeFive{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your age:");
		int age = sc.nextInt();
		
		if (age>0 && age <12){
			System.out.println("Child");
			
		}else if( age > 13 && age < 19){
			System.out.println("Teenager");
		}else if( age > 20 && age < 60){
			System.out.println("Adult");
		}else{
			System.out.println("Senior citizen");
		}
	
	}
}