/*
Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].
*/

class palindrome{
	int a[];
	
	void inputArray(int arr[]){
		a=arr;
	}
	
	boolean isPalindrome(){
		int s=0, e=a.length-1;
		
		while(s>e){
			if(a[s]!=a[e]) return false;
			
			s++; e--;
		}
		
		return true;
	}

}


public class ArrayPalindrome{
	
	public static void main(String x[]){
		
		int m[]=new int[]{10,20,30,20,10};
		
		palindrome p1=new palindrome();
		
		p1.inputArray(m);
		
		System.out.println(p1.isPalindrome()?"Give Array Is Pallindrone" : "Given Array Is not Pallindorne");
		
	}
}