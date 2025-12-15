// Q2. Shuffle the Array

public class ShuffleArray{
	public static void main(String x[]){
		
		int a[]=new int[]{2,5,1,3,4,7};
		//                0 1 2 3 4 5 
		int len=a.length/2;
		
		int c[]=new int[a.length];
		System.out.println("Enter the Shuffle from:");
		System.out.print("\n[");
		for(int i=0; i<a.length; i++){
			System.out.print(" "+a[i]);
		}
		System.out.print("]\n");
		int k=0,j=n;
		for(int i=0; i<c.length; i++){
			if(i%2==0){
				c[i]=a[k];
				k++;
			}else{
				c[i]=a[j];
				j++;
			}
			 
		}
		
		System.out.print("\n[");
		for(int i=0; i<c.length; i++){
			System.out.print(" "+c[i]);
		}
		System.out.print("]\n");
		
	}
}