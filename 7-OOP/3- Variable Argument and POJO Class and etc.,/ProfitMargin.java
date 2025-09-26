/*
5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.
*/
import java.util*;

class Company{
		private String companyName;
		private int revenue, expenses;
		
		public void setCompanyName(String companyName){
			this.companyName=companyName;
		}
		
		public String getCompanyName(){
			return companyName;
		}
		
		public void setRevenue(int revenue){
			this.revenue=revenue;
		}
		
		public int getRevenue(){
			return revenue;
		}
		
		public void setExpenses(int expenses){
			this.expenses=expenses;
		}
		
		public int getExpenses(){
			return expenses;
		}
}


public class ProfitMargin{
	
	public static void main(String x[]){
	
	}
}