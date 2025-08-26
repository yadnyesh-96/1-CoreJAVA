/*
Write a Java program to calculate the net salary of an employee.
Input: basic salary, HRA %, DA %, and tax %.
*/

import java.util.*;
public class NetSalCalculation{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Net Salary:");
	int bS = sc.nextInt();
	
	System.out.println("Enter the HRA(%):");
	float a = sc.nextInt();
	float hra = a/100f;
	float HRA = (hra*bS);
	System.out.println(HRA);
	
	System.out.println("Enter the DA(%):");
	float D = sc.nextInt();
	float da = D/100f;
	float DA = (da*bS);
	System.out.println(DA);
	
	System.out.println("Enter the Tax(%):");
	float T = sc.nextInt();
	float tax = T/100f;
	float Tax = (tax*bS);
	System.out.println(Tax);
	
	float netSal =HRA + DA + Tax +bS ;
	
	System.out.println(netSal);
	}
}