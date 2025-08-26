public class NumHollowFullPyramid{

		public static void main(String x[]){
		
			for(int i=1; i<=5; i++){
				
				for(int j=1; j<=9; j++){
					
					if( (j == 1 || j == i || i == 5)){
								System.out.printf("*");
					}else{
							System.out.printf(" ");
					}
					}
			System.out.printf("\n");
				}
		
		}

}