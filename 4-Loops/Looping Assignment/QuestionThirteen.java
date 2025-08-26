// Q13. Write a java program to enter a number and print its reverse.

public class QuestionThirteen{

	public static void main(String x[]){
	
		int no =123 ;
		int b; 
		int c =0;
		
		
		while(no!= 0){
				b = no % 10;
				no = no / 10;
				c = c*10+b;
				
			
		}
		System.out.println(c);
	}

}

/*
