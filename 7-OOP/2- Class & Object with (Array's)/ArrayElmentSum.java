/*
Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum(int arr[])
Logic: Traverse array and add all values to sum.

*/

class ArraySum{
	int a[];
	void inputArray(int arr[]){
		a=arr;
		
	}
	
	int calculateSum(){
		int sum=0;
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		
		return sum;
	}
	

}

public class ArrayElmentSum{

	public static void main(String x[]){
			int m[]=new int[]{1,2,3};
			
			ArraySum A1=new ArraySum();
			
		//	A1.inputArray(m);
			System.out.println("Sum of Array Element is:"+A1.calculateSum(m));
		
	}
}