public class FullPyramid{

		public static void main(String x[]){
		
				for(int i=1; i<=4; i++){
					
								for(int j=1; j<=7; j++){
									
									if((j>=5-i) && (j<=3+i)){	
									System.out.printf("*");
									}else{
										System.out.printf(" ");
									}
									}
					System.out.printf("\n");
				}
		
		}

}