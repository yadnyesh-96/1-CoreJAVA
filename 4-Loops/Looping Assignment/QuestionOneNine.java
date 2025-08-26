// Q19. Write a java program to find the sum of the first and last digit of a number.

import java.util.*;
public class QuestionOneNine{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	do{	
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		int count =0;
		
		int temp = no;
		
		System.out.println("THe Entered no is:"+no);
		
		while(no !=0){
		
			++count ;  //
			no = no/10; 
		}
		no = temp ;
		int last = no%10; // 12345%10 == 5 sepearetes the last digit 
		int p = (int)Math.pow(10,--count); // 10000
		int first = no/p; //  the first digit 12345/10000 == 1
		// no = no % p; // 12345%10000 == 2345
		 // no = no/10; // store the last digit 2345/10== 234
		//last = last*p; // 5*10000 = 50000;
		// no = no*10; //234*10 = 2340
	// 	no = no + last + first; // 2340 + 50000 + 1 == 52341 
		no = first+last;
		System.out.println("Addition of first and last digit is;"+no);
	}while(true);
	}

}