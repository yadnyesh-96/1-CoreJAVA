//Q52. Write a java program to display following series :
//           	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 	


public class QuestionFiftyTwo{
	
	public static void main(String x[]){
		
			int i = 1;
			int num1 = 0;
			int j =7;
			int num2 =0;
			
			while(i!=12 && j != 0 ){    //i<=9 ||   && j != 0 
					
				num1 = i*2;
				System.out.println(num1);
				
				
				
				/*
					num2 =(int)Math.pow(j,3);
					System.out.println(num2);
				*/	
				System.out.println(j);
					j--;
			
				
				i++;
			}
		
	}





}


