public class NumFullPyramid{

		public static void main(String x[]){
		
		int n=0;
		for(int i=1; i<=5; i++){
			
			n=i;
			for(int j=1; j<=9; j++){
				
					if((j>=6-i) && (j<=4+i)){
						
						System.out.print(n);
						if(j<5){
	                     n++;
						 
						}
						else {
							n--;
						}
						
					}else{
						System.out.printf(" ");
					}
				
			}
			System.out.println();
		}
		
		
		}


}