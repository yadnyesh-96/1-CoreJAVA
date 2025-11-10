/*
8. Question:
 Create a base class Loan with fields amount and years.
 HomeLoan has interest rate of 7%.

 CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
 
 Explanation:
 Tests inheritance with customized formula calculations.
*/

import java.util.*;
class Loan{
	double amount;
	int years;
	
	Loan(double amount,int years){
		this.amount=amount;
		this.years=years;
	}
	
	
}

class HomeLoan extends Loan{
	
	HomeLoan(double amount, int years){
		super(amount,years);
	}
	
	void DisplayInterestRate(){
		
		double monthlyRate = 7.0/(12 * 100);  // 0.005833
        int months = years * 12;

        double emi = (amount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        double totalPayment = emi * months;
        double totalInterest = totalPayment - amount;
		
		
        System.out.println("Monthly EMI: "+ emi);
		System.out.println("Total Payment ("+ years +" years): " + totalPayment);
        System.out.println("Total Interest: "+ totalInterest);
		
	}
} 

class CarLoan extends Loan{
	
	CarLoan(double amount,int years){
		super(amount,years);
	}
	
	void DisplayInterestRate(){
		
		double monthlyRate = 9.0/(12 * 100);  // 0.005833
        int months = years * 12;

        double emi = (amount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        double totalPayment = emi * months;
        double totalInterest = totalPayment - amount;

        System.out.println("Monthly EMI: "+ emi);
		System.out.println("Total Payment ("+ years +" years): " + totalPayment);
        System.out.println("Total Interest: "+ totalInterest);
		
	}
	
}

public class LoanEMIApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("HomeLoan has interest rate of 7%.");
        System.out.print("Enter the Principal Amount of Loan: ");
        double amt = sc.nextDouble();
        System.out.print("Enter the Loan Period (in years): ");
        int yrs = sc.nextInt();
		
		HomeLoan h1=new HomeLoan(amt,yrs);
		h1.DisplayInterestRate();
		
		System.out.println("----------------------------------\n");
		System.out.println("CarLoan has interest rate of 9%.");
        System.out.print("Enter the Principal Amount of Loan: ");
        amt = sc.nextDouble();
        System.out.print("Enter the Loan Period (in years): ");
        yrs = sc.nextInt();
		
		CarLoan c1=new CarLoan(amt,yrs);
		c1.DisplayInterestRate();
	}
}