import java.util.*;
public class SECMAXAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Store the elements in array:");
		for(int i=0; i<a.length; i++){
			System.out.print(i+"=");
			a[i]=sc.nextInt();
		}
		
		System.out.print("\n[");
		for(int V:a){System.out.print(V+" ");}
		System.out.print("]\n");
		
		
		int max_val1=a[0],max_val2=0;
		
		for(int i=0; i<a.length; i++){
			if(a[i]>max_val1){
				max_val1=a[i];
			}
		}
		
		for(int j=0; j<a.length; j++){
			if(a[j]>max_val2){
				if(a[j]<max_val1){
					max_val2=a[j];
				}
			}
		}
		
		System.out.println("First Max Value:"+max_val1);
		System.out.println("First Max Value:"+max_val2);
	}		
}