import java.util.*;
class TestApp{
	
	public static void main(String x[]){
		int a[]=new int[]{25,20,10};
		
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
		
		System.out.println(Arrays.toString(a));
	}
}