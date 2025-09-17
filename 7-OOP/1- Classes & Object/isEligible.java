/*
7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/
import java.util.*;
class Eligibility{
	Scanner sc=new Scanner(System.in);
	int a;
	
	void SetValue(){
		a=sc.nextInt();
	}
	
	void ConMatch(){
		if(a>=18){
			System.out.println("Eligible for Voting");
		}else{
			System.out.println("Not Eligible");
		}
	}
	
}

public class isEligible{
	public static void main(String x[]){
		
		Eligibility e=new Eligibility();
		
		e.SetValue();
		e.ConMatch();
	}

}