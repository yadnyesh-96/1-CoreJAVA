/*
Write a Java program to reverse a number without using loop.
Input a number: 123 
*/

import java.util.*;
public class ReverseNo{

	public static void main(String x[]){
	int no, b, c = 0;
	
	no = 123;
	
	b = no % 10; // 3
	no = no / 10; //12
	c = c*10+b; // 300
	
	b = no % 10; // 2
	no = no / 10; // 1
	c = c*10+b;//320

	b = no % 10; // 1
	no = no/ 10;
	c = c*10+b;
	
	System.out.println(c);
	}
}

