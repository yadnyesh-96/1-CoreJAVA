/* Calculate total bill with tax and discount 
tax ==%12 of billing amount 
discount == 5% of billing amount 
-assume:
Billing amount -100rs tax=12%=12rs discount=5%=107rs
*/

public class TaxDisc{

	public static void main(String x[]){
	
	int amt=Integer.parseInt(x[0]);
	//int a = amt%30;
	int tax=amt*12/100;
	int dis=amt*5/100;
	
	int total=amt+tax+dis;
	System.out.println("Amont without discount & Tax:"+ amt);
	System.out.println("Total Billing amount With discount and Tax:"+total);
	}
}