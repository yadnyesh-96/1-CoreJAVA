// Example : WAP to input number from keyboard and check number is armstrong or not?
import java.util.*;
public class AMAPP{
	public static void main(String x[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		int temp = no;
		int count=0;
		//int pow =1;
		int sum=0;
		int i=1;
		while(no!=0){
			++count;
			no = no/10;
		}
		
		no = temp;
		
		while(no!= 0){
				//++count;
			int num = no%10; //153%10==3
				
			
				no = no/10; // 153/10 ==15.3 ==15
				
		
						 
						int pow = (int)Math.pow(num,count);
						sum = pow+sum;
						

					
				
		}
		String str = temp==sum ? "armstrong" : "not armstrong";
		System.out.println(str);
		
		
	}
	
}