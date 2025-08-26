//write a java program to calculate simple interest .
// SI = (P * R * T) / 100 
/*
SI:Simple Interest.
P:Principal amount.
R:Rate of interest per year (%).
T:Time period (years).
*/

public class SIApp{

	public static void main(String x[]){
	
	int p=Integer.parseInt(x[0]); // Princeple Amount 
	int r=Integer.parseInt(x[1]); // Rate of interest per year (%).
	int t=Integer.parseInt(x[2]); // Time Period (years).
	
	int mul=(p*r*t);
	int si=(mul)/100;
	int total= p+si;
	
	System.out.println("Princepe Amoubnt:"+p);
	System.out.println("Simple Interest:"+si);
	System.out.println("Total Amount:"+total);
	}
}