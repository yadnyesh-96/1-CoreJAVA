public class HollowInvertedPyramid{

	public static void main(String x[]){
	
			for(int i=1; i<=6; i++){
				
				for(int j=1; j<=6; j++){
					
					
						if(j==1 || i==1 || (i==2 && j==5) || (i==3 && j==4) || (i==4 && j==3) || (i==5 && j==2)){
						System.out.printf("*");
						}else{
							
							System.out.printf(" ");
						}
					
				}
				
				System.out.printf("\n");
			}
	}

}