/*
Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                                	Basic Salary > 20000 : HRA = 30%, DA = 95%
*/


import java.util.*;
public class QuestionFourteen{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Your Salary:");
	int sal = sc.nextInt();
	
	if (sal <= 10000){
		System.out.println("Salary of Employee:"+sal);
		double total = sal + ((sal*20)/100) + ((sal*80)/100);
		System.out.println("Gross Salary According to Salary of Employee:"+total);
	}else if(sal <= 20000){
		double total = sal + ((sal*25)/100) + ((sal*90)/100);
		System.out.println("Gross Salary According  to Salary of Employee:"+total);
	}else if(sal > 20000){
		double total = sal + ((sal*30)/100) + ((sal*95)/100);
		System.out.println("Gross Salary According to Salary of Employee:"+total);
	}
	}
}