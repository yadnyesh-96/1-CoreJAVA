/*
Q14. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target.

*/
import java.util.*;
class Pair{

	int a[];
	
	void inputArray(int arr[]){
		a=arr;
	}
	
	void findPairs(int target){
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]+a[j]==target){
					System.out.println("("+a[i]+" & "+a[j]+")="+target);
				}
			}
		}
			
	}
}

public class ArrayPairSum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int m[]=new int[]{10,20,50,40};
		System.out.printf("[");
		for(int n:m){System.out.printf("%d \t",n);}
		System.out.printf("] \n");
		
		System.out.println("Enetr the Target Number:");
		int t=sc.nextInt();
		Pair p1=new Pair();
		
		p1.inputArray(m);
		p1.findPairs(t);
	}
}
