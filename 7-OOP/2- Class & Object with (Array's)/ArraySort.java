/*
Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray(int arr[])
Logic: Use Bubble Sort / Selection Sort.

*/

class sort{
	int a[];
	void inputArray(int arr[]){
		a=arr;
	}
	
	void sortArray(){
		//printing the before the sorting array
		System.out.printf("[");
		for(int i=0; i<a.length; i++){
			
			System.out.printf("%d \t",a[i]);
			
		}
		System.out.printf("]");
		
		//Array Sorting Logic
		int temp=0;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println();
		//printing the after the sorting array
		System.out.printf("[");
		for(int i=0; i<a.length; i++){
			System.out.printf("%d \t",a[i]);
			
		}
		System.out.printf("]");
	}

}

public class ArraySort{

	public static void main(String x[]){
	
		int m[]=new int[]{90,45,75,60,80,10};
		
		sort s1=new sort();
		s1.inputArray(m);
		 s1.sortArray();
		
	}
}