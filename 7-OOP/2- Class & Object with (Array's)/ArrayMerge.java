/*
Q9. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/

class Merge{
	int a[];
	int b[];
	
	void inputArray(int arr1[], int arr2[]){
		a=arr1;
		b=arr2;
	}
	
	int[] mergeArrays(){
		int index=0;
		int k[]=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++){
			k[index++]=a[i];
		}
		
		for(int i=0; i<b.length; i++){
			k[index++]=b[i];
		}
		return k;
	}
	
}

public class ArrayMerge{

	public static void main(String x[]){
		
		int m[]=new int[]{10,20,30,40,50};
		int n[]=new int[]{60,70,80,90,100};
		
		Merge m1=new Merge();
		
		m1.inputArray(m,n);
		
		int p[]=m1.mergeArrays();
		
		int sum=m.length+n.length;
		
		System.out.println("Merged Array is:");
		for(int i=0; i<sum; i++){
			System.out.println(p[i]);
		}
	}
}