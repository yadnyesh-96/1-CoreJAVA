/*
Jagged Array 
in java Jagged Array also called as the Array bu the 
jagged array as 2D type such as row nad column size are different
*/
import java.util.*;
public class JaggedArray{
	
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		/*
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}