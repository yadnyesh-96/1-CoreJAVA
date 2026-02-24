
// Rotate array 
import java.util.*;

public class RotateArrayApp{
	
	public static void rotate(int a[],int start,int end){
		while(start<end){
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
	}
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[]{1,2,3,4,5};
		System.out.println("Array is:");
		for(int val:a){
			System.out.print(val+" ");
		}
		
		System.out.println("\nWhere from you want to rotate? :");
		int k=sc.nextInt();
		
		int n = a.length;
		k=k%n;
		
		rotate(a,0,n-1);
		
		// Step 2: reverse first k elements
		rotate(a,0,k-1);
		
		// Step 3: reverse remaining elements
		rotate(a,k,n-1);
		System.out.println("Reversed Array:");
		for(int val:a){
			System.out.print(val+" ");
		}
	}
}