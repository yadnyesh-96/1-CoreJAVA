/*
Q11. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.

*/

class Largest{
	int a[];
	void inputArray(int arr[]){
		a=arr;
	}
	
	int findSecondLargest(){
		int max=0;
		for(int i=0; i<a.length; i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		
		int secmax=0;
		int sm=Integer.MIN_VALUE;
		
		for(int j=0; j<a.length; j++){
			if(a[j]<max){
				secmax=a[j];
				if(secmax>sm){
					sm=secmax;
				}
			}
		}
		
		return sm;
	}
	
}

public class ArraySecondLargest{

	public static void main(String x[]){
		
		int m[]=new int[]{10,20,50,30,40,80};
		
		Largest s1=new Largest();
		
		s1.inputArray(m);
		System.out.println(s1.findSecondLargest());
	}
}