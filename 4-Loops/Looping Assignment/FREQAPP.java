//how to find the frequency of each digit in a given integer. example theory

public class FREQAPP{

	public static void main(String x[]){
	
	
			int no = 122334455;
				int tem = no;
			int i =1;

			while(i <= 9){
				int rem=0;
			
				int count=0;
				
				while(no !=0)
				{
					 rem = no%10;
					
					if(i==rem){
							++count;
							
					}
					no = no/10;
					
				}
				if(count>0){
					System.out.println(i+" "+count);
				}
				no=tem;
				
				
				i++;	
			}	
	}



}