// 9.Write a C program to print a multiplication table of any number.


import java.util.*;

public class QuestionNine{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int n =1;
		while(n<=10){
			int tem = no*n;
			System.out.println(tem);
			n++;
		}
	
	}
}