// Q24. Write a java program to Check Number Is Strong Number or Not.

public class PERNOAPP{

	public static void main(String x[]){
		
		int no = 145;
		int temp=no;
		int sum = 0;
		int i=1;
		int fac = 1;
		
		while(no !=0){
			
			int num = no%10; //145%10 = 5;
			
			
		
				while(i <= num){
				
				//System.out.println("1.num"+num);
				 fac = fac*i;
				 
				i++;	
				}
				i=1;
			
			sum = sum+fac;
			

		
			fac=1;
		   no = no/10;
		}
		String str = sum==temp ? "Strong Number" : "Not Strong";
		System.out.println(str);
		
	
	}

}