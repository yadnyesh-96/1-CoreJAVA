/*
Q42. Write a Java program to print all automorphic numbers between 1 and n. 
An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.

*/

public class AutomorphicApp{

	public static void main(String x[]){
	
			int n = 1;
		while(n <=100){
					int no = n*n;
					int rem=0;
					boolean flag =false;
					while(no != 0){
						 
						  rem = no %10; 
						  if(rem ==n){
						  System.out.println("rem ;"+rem);
							  flag = true;
							  break;
						  }
						 no = no /10;

					}if(flag){
							  System.out.println("Number is Harshad");
						  }else{
							 System.out.println("Number is not Harshad"); 
						  }
			

				n++;
		}
	}

}