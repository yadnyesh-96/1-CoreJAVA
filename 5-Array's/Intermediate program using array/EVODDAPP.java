
import java.util.*;
public class EVODDAPP{
	public static void main(String x[]){
		int a[]=new int[]{1,2,3,4,5,6};
			
		//,k=1;
		for(int i=0; i<a.length; i++){
			
			int j=i;
			if((a[j]%2==0)&&(i%2!=0)){
				
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
			j++;
		}
		
		System.out.println(Arrays.toString(a));
	}
}