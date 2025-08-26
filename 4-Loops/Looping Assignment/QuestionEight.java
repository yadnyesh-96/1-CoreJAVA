// 8.Write a C program to find the sum of all odd numbers between 1 to n.


public class QuestionEight{

	public static void main(String x[]){
	
	int n = 1;
	int tem = 0;
	
		while(n <=100){
			
			if(n%2 != 0){
				tem = tem + n;
				n++;
				
			}
			n++;
		}
		System.out.println(tem);
	}

}