
public class PatternOneApp{

	public static void main(String x[]){
	
		for(int i=1; i<=3; i++){
			
			for(int j=1; j<=3; j++){
				if(j<=i){
				System.out.printf("*");
				}
			}
			
			System.out.printf("\n");
		}
	
	}

}