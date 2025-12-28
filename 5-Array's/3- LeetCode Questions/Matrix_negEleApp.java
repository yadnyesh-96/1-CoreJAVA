
public class Matrix_negEleApp{
	public static void main(String x[]){
		int a[][]=new int[][]{{3,2},{1,0}};
		//int a[][]=new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		
			//[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]
			
		int count=0;	
		for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a[i].length; j++){
				//System.out.print(a[i][j]+" ");
				if(a[i][j]<0){
					count++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Negative's are :"+count);
	}
}
