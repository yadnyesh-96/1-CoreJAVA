/*
Q15.Find Intersection of Two Arrays
Class: ArrayIntersection
Functions:
void inputArrays(int arr1[], int arr2[])
void findIntersection()
Logic:
Compare elements of arr1 with arr2.
If common element found, print it (but avoid duplicates).
*/
import java.util.*;
class Intersection{
	int[] a,b;
	
	void inputArrays(int arr[], int arr1[]){
		a=arr;
		b=arr1;
	}
	
	void findIntersection(){
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0, j=0;
		
		while(i<a.length && j<b.length){
			if(a[i]==b[j]){
				 if (i == 0 || a[i] != a[i - 1]) {
                    System.out.println(a[i]);
                }
                i++;
                j++;
			}else if(a[i]<b[j]){
				i++;
			}else{
				j++;
			}	
		}
	}
}

public class ArrayIntersection{
	public static void main(String x[]){
		
		int a1[]=new int[]{10,20,30,40,50};
		
		int a2[]=new int[]{10,80,20,30,30,40};
		
		Intersection i1=new Intersection();
		
		i1.inputArrays(a1,a2);
		i1.findIntersection();
	}
}