// convert days into year, weeks and days 

public class Year{

	public static void main(String x[]){
	
	int day=Integer.parseInt(x[0]);
	int yr= day/365;
	int wk= day/7;
	int ds= day;
	
	
	System.out.println(yr+"Years, "+wk+"Weeks, "+ds+"days");
	
	}
	
}