/*
4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.
*/

import java .util.*;
class Player{
		
		private String name;
		private int score;
		
		
		public void setName(String name){
			this.name=name;
		}
		
		public String getName(){
			return name;
		}
		
		public void setScore(int score){
			this.score=score;
		}
		
		public int getScore(){
			return score;
		}
	
}

public class PlayerScore{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		Player p1[]=new Player[2];
		
		for(int i=0; i<p1.length; i++){
		System.out.println("|> Enter the "+(i+1)+" Details");
		
			p1[i]=new Player();
			
			System.out.println(" Enter the Player Name: ");
			String nm=sc.nextLine();
			
			System.out.println("Enter the Score: ");
			int src=sc.nextInt();
			
			p1[i].setName(nm);
			p1[i].setScore(src);
			
			sc.nextLine();
			System.out.println();

		}
		System.out.printf("%-25s %-10s \n","Name", "Score\n-------------------------------+");
		
		for(int j=0; j<p1.length; j++){
			for(int k=1; k<p1.length; k++){
				if(p1[j].getScore()>p1[k].getScore()){
					System.out.printf("%-25s %-10s \n",p1[j].getName(),p1[j].getScore());
				}
			}
		}
	}

}