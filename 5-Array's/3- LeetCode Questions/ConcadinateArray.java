import java.util.*;

public class ConcadinateArray{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		
		
		int len=a.length;
		
		int b[]=new int[len+len]; 
		
		System.out.println("Enter the Values in array:");
		for(int i=0; i<len; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0; i<b.length; i++){
			if(i<len){
			b[i]=a[i];
			}else{
			b[i]=a[i-len];
			}
		}
		
		System.out.println("\n Array:" );
		for(int V:b){
			System.out.println(V+" ");
		}
		
	}	
}