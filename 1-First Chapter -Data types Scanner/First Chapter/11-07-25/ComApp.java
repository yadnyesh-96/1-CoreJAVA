/*
Write a java program to 
Calculate the compound interest.
The formula is: A = P (1 + r/n)^(nt).
A	=	final amount.
P	=	initial principal balance.
r	=	interest rate.
n	=	number of times interest applied per time period.
t	=	number of time periods elapsed.
*/

public class ComApp{

	public static void main(String x[]){
	
//	int a = Integer.parseInt(x[0]); // final Amount 
	int p = Integer.parseInt(x[0]); // initial principal balance.
	int r = Integer.parseInt(x[1]);	// interest rate 
	int n = Integer.parseInt(x[2]); // number of times interest applied per time period.
	int t = Integer.parseInt(x[3]); // number of time period elapsed.
	
	int b = p*(1+r/n);
	double cal = Math.pow(b,n*t);
	
	System.out.println(cal);
	}
}