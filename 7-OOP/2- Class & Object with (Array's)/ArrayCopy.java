/*
Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.
*/

class Copy{
	int a[];
	void inputArray( int arr[]){
		a=arr;
	}
	
	int[] copyArray(){
	int k[]=new int[a.length];
		for(int i=0; i<k.length; i++){
			k[i]=a[i];
		}
		
		return k;
	}
	
	
}

public class ArrayCopy{
	
	public static void main(String x[]){
		
		int m[]=new int[]{10,20,30,40,60};
		
		Copy c1=new Copy();
		
		c1.inputArray(m);
		
		int n[]=c1.copyArray();
		
		System.out.println("Copied Element is:");
		for(int i=0; i<n.length; i++){
				System.out.println(n[i]);
		}
		
	}
}