/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*

public class HourCube{
	public static void main(String x[]){
		
		int n=9;
		//char ch=65;
		for(int i=1; i<=n; i++){
			char ch=65;
			for(int j=1; j<=n; j++){
				
				
				if((j>=i && j<=n-(i-1))||(j<=i && j>=n-(i-1))){
					
					System.out.print(ch++);
					
				}else{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}
}