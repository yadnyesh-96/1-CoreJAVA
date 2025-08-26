// Q16. Write a java program to find power of a number.


import java.util.*;
public class QuestionOneSix{


	public static void main(String x[]){
	int no = 2;
	int n = 2; 
	 
	int tem = 1;
	
	while(no != 0){
	
		tem = tem*n;
		--no;
	}
	System.out.println(tem);
	}
}