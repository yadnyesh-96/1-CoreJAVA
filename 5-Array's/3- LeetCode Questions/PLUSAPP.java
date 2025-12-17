// Q. Plus one 

import java.util.*;
public class PLUSAPP{
	
	public static int[] getArray(int[] num){
	
		int len=num.length;
		
		if(num[len-1]>=9){
			int sum=num[len-1]+1;
			int count =0;
			int temp=sum;
			while(sum!=0){
					int rem=sum%10;
					sum=sum/10;
					count+=1;
			}
			int[] a=new int[count];
			int i=0;
			while(temp!=0){
				int rem=temp%10;
				
				temp=temp/10;
				a[i++]=temp;
			}
			int l=a.length;
			int[] c=new int[len+(l-1)];
			int m=0;
			for(int k=0; k<c.length; k++){
				if(k<len-1){
					c[k]=num[k];
				}else{
					c[k]=a[m++];
				}
			}
			return c;
			
		}else{
			int val=num[len-1];
			num[len-1]=val+1;
				
			return num;
		}
	}
	public static void main(String x[]){
		int num[]=new int[]{9,9};
		
		int len=num.length;
		
		System.out.println("last digit:"+num[len-1]);
		
		int val[]=getArray(num);
		
		System.out.println(Arrays.toString(val));
	}
}