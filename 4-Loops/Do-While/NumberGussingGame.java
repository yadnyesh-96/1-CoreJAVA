/*
 4. Number Guessing Game

Description:	

* System generates a random number between 1–100.
* Use a do-while loop to let the user guess the number.
* If guess is too high or low, give a hint and **continue**.
* If the guess is correct, print "You guessed it!" and **break**.
// use Random class and its method nextInt(range);
---
*/
import java.util.*;
public class NumberGussingGame{

			public static void main(String x[]){
				Scanner sc=new Scanner(System.in);
				Random rm=new Random();
					int a=1;
					int b=100;
					int Rnum=rm.nextInt(b-a+1)+a;
					System.out.println(Rnum);
					System.out.println("Number Guessing Game");
				do{
					System.out.println("-------------------------");
				
					System.out.println("Enter the Number Between 1-100");
					int Num=sc.nextInt();
					if(Num<Rnum){
						System.out.println("Guess Highr Number");
					}else if(Num>Rnum){
						System.out.println("Guess Lower Number");
					}else if(Num==Rnum){
						System.out.println("Win The Game..");
						System.out.println("Number Gussed Correct");
						System.out.println("-------------------------");
						break;
					}
			     }while(true);
					 
			}

}