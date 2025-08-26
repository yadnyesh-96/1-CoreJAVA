//Q34. Write a java program to display 1 to nth Armstrong Number.


public class OneTNARMapp{

	public static void main(String x[]){
	int n=1;
	while(n <=1000){
		
			int no = n;
			int temp =no;
			int count=0;
			int rem;
			
			while(no !=0){
				++count;
				rem = no%10;
				no = no/10;
			}
			no=temp;
			int p;
			int sum=0;
			while(no != 0){
				
				rem = no%10;
				p = (int)Math.pow(rem,count);
				sum=sum+p;
				
				
				no = no/10;
			}
			if(sum==temp){
						System.out.println(temp+" :is Armstrong Number");
					}

			
		n++;
	}
	
	}


}