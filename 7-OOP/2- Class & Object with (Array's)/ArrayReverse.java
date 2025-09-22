/*
Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray(int arr[])
*/

class Reverse{
	int a[];
	void inputArray(int arr[]){
		a=arr;
	}
	
	void reverseArray(){
		int i=a.length-1;
		while(i>=0){
			System.out.println(a[i]);
			i--;
		}
		/*
		for(int i=a.length-1; i>=0; i--){
			System.out.println(a[i]);
		}
		*/
	}
}


public class ArrayReverse{
	
	public static void main(String x[]){
		int m[]=new int[]{10,20,30,40,50,60};
		
		
		Reverse r=new Reverse();
		r.inputArray(m);
		r.reverseArray();
		
		
		
	}

}