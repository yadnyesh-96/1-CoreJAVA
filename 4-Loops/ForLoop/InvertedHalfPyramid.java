public class InvertedHalfPyramid{

	public static void main(String x[]){
			
		for(int i=1; i<=6; i++){
			
			for(int j=1; j<=6; j++){
				
				if(j>=i){
					
					System.out.printf(" +");
				}
			}
			
			System.out.printf("\n");
		}
	
	}

}