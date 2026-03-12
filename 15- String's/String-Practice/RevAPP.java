
import java.util.*;
public class RevAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbe to revrse:");
		int num=sc.nextInt();
		
		System.out.println("Enter the String to reverse:");
		String str=sc.next();
		
		System.out.println("Reversed Number :"+revNum(num));
		System.out.println("Reversed Sting :");
		revString(str);
				
	}
	
		static int revNum(int num){
			int rev=0;
			while(num!=0){
				int rem=num%10;
				rev=rem+rev*10;
				num=num/10;
			}
			
			return rev;
		}
		
		
		static void revString(String str){
			char ch[]=str.toCharArray();
			int len=ch.length;
			for(int i=len-1; i>=0; i--){
				System.out.print(ch[i]+" ");
			}
		}
}