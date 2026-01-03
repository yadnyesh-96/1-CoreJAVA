
import java.util.*;
public class LeetCode_34{
	public static void main(String x[]){
		
		int a[]=new int[]{5,7,7,8,8,10};
		int a1[]=new int[]{-1,-1};
		int target=8;
		int count=0;
		for(int i=0; i<a.length; i++){
			if(a[i]==target){
				count++;
			}
		}
		int j=0;
		for(int i=0; i<a.length; i++){
			if(a[i]==target){
				a1[j]=i;
				j++;
			}
			
		}
		
		System.out.println(Arrays.toString(a1));
	}
}