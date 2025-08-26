/*
Q25.Write a java program to find the total number of notes in a given amount.  
                    	
            Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/


public class QuestionTwoFive{

	public static void main(String x[]){
	
		int amt = 2180;
		
		if ((amt%1000)<=500){	// 528>500 == true
			int div1 = amt / 500; // 5 of Five note.
			System.out.println("500="+div1);
			amt = amt % 1000; // 528 
			
			if (amt<=100 && amt>=100){
				int div2 = amt / 100; 
				System.out.println("100="+div1);
				amt = amt % 1000; 
				// System.out.println(amt);
			}else if (amt<=50){
				int div3 = amt / 50; 
				System.out.println("50="+div1);
				amt = amt % 1000; 
			}else{
				System.out.println("==");
			}	
		}else {
			System.out.println("Ivalid Input");
		}		
		
	}
}


/*
int num1 = 2528 / 500; //5
		int num2 = 2528 / 100; //100
		int num3 = 2528 / 50; //50
		int num4 = 2528 / 20; //126
		int num5 = 2528 / 10; //252
		int num6 = 2528 / 5; //505
		int num7 = 2528 / 2; //1264
		int num6 = 2528 /1; //2528
		
*/		