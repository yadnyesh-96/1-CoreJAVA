/*
Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int arr[], int key)
Logic: Traverse array, check if key matches any element.

*/

class Search{
	int a[],b;
	
	void inputArray(int arr[],key){
		a=arr;
		b=key;
	}

	boolean searchElement(){
		for(int i=0; i<a.length; i++){
			if(a[i]==b){
			 return true;
			}else{
				return false;
			}
		}
		
	}
}


public class ArraySearch{
	
	public static void main(String x[]){
		int m[]=new int[]{10,20,30,40,50,60};
		
		Search s1=new Search();
		
		s1.inputArray(m);
		System.out.println(s1.searchElement());
	
	}

}