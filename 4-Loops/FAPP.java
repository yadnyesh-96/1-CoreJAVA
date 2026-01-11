// WAP take input the number and print the their factorial.
import java.util.*;
public class FAPP{

	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to print their factorial:");
		int num = sc.nextInt();
		long fac = 1;
		int i = 1;
		while(i <=num){
		
			
			fac = fac*i;
			//System.out.println("Factoral:"+fac);
			i++;
		}
		System.out.println("1. Factoral:"+fac);

	}
}