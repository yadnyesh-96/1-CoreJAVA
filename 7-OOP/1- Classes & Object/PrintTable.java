/*
16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing.
*/

import java.util.*;

class MultiplicationTable{
	
	void Table(int num){
		int i=1;
		while(i<=10){
			System.out.println(i+"X"+num+"="+i*num);
		 i++;
		}
	
	}

}

public class PrintTable{
	
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		MultiplicationTable m=new MultiplicationTable();
		
		m.Table(n);
	}

}