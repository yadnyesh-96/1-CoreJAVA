/*
Q44. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%

*/
import java.util.*;
public class SalaryAllocation{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int sal = sc.nextInt();
	String str = sal<= 10000 ? "The Salary of Employee1 is:"+(((sal*20)/100)+((sal*80)/100)+sal): sal<=20000 ? "The salary of Employee2 is:" +(((sal*25)/100)+((sal*90)/100)+sal): "The salary of employee3 is:"+(((sal*30)/100)+((sal*95)/100)+sal); 
	
	System.out.println(str);
	}

}