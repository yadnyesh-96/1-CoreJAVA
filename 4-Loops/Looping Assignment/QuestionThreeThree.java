// Q33. Write a java program to display 1 to nth Strong Number.


public class QuestionThreeThree{
		
	public static void main(String x[]){
	
	int n = 1;		
	boolean flag =false;
	int temp=0;
	while(n <= 1000){
		
		
				int no = n;
				temp = no;
				int rem;
				int sum=0;
				while(no != 0){
					
					int i = 1;
					int fac = 1;
					rem = no%10; // 5 , 4 , 1 ;
						while(i <= rem){
							
							fac = fac*i;   // 1*1=1 , 1*2=2 , 2*3=6 , 6*4=24 , 24*5=120

							i++;
						}
						sum = sum+fac;
					
					 no = no/10;
					 if(sum==temp){
						System.out.println(temp+" :is Strong Number");
					 }
				}
			
			
			n++;	
	    }	
		
		
		
	
	
	}


}