/*
Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven(int arr[])
int countOdd(int arr[])
Logic: Use % 2 == 0 check.
*/

class evenOdd{
	
	int a[];
	void inputArray(int arr[]){
			a=arr;
	}
	
	int countEven(){
		int ev=0;
		for(int i=0; i<a.length; i++){
			if(a[i]%2==0){
				ev++;
			}
		}
		return ev;
	}
	
	int countOdd(){
		int od=0;
		for(int i=0; i<a.length; i++){
				if(a[i]%2!=0){
					od++;
				}
		}
		return od;
	}

}

public class ArrayEvenOdd{

	public static void main(String x[]){
		int m[]=new int[]{10,35,28,21,24,2};
		
		evenOdd c=new evenOdd();
		c.inputArray(m);
		System.out.println("Even Counts:"+c.countEven());
		System.out.println("Odd Count:"+c.countOdd());
	}
}