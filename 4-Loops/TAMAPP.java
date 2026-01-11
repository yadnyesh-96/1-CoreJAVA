// Example : WAP to input number from keyboard and check number is armstrong or not?
import java.util.*;
public class TAMAPP{
	public static void main(String x[]){
		//Scanner sc =  new Scanner(System.in);
		//System.out.println("Enter the Number");
		//int no = sc.nextInt();
		
		
		
		
		
		/*
		----------------
		*/
		int i = 1; 
		while(i <1000){
		int count=0; 
			int no = i;
			//System.out.println(i);
		int sum=0;
		int temp = no;//////////55
			
			while(no!=0){
				
			++count;//1 2
			no = no/10;
			}
		//System.out.println(count);
			no = temp; //55
		
		while(no!= 0){ //55
				//++count;
			int num = no%10; //153%10==3  5 5
							 
						int pow = (int)Math.pow(num,count); //25 25
						sum = pow+sum;                      //25 50
						no = no/10; // 153/10 ==15.3 ==15 //0	
				//System.out.println(sum);
		}

		if(temp==sum){
			System.out.println(sum);
		}
		i++;	//1
		}
		
	}
	
}