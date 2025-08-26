// Q32. Write a java program to display 1 to nth Duck Number.

public class OneToNDUCKAPP{


	public static void main(String x[]){
	
	int n = 100;
	int i =1;
	
	
	while(i <= n){
		
			int no = i;
			int rem=0;
			boolean flag=false; 
			
			while(no != 0){
				
				rem = no % 10; //
				if(rem==0){
					flag =true;
					break;
				}
				no = no/10;
				
			}
			if(flag){
				System.out.println("Duck number 1 to "+n+": "+no);
			}
	     
		i++;
	}
	
	}

}