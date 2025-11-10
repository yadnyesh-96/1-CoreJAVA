/*
7. Question:
 Create a class Ticket with method calculatePrice().
	MovieTicket has 18% GST.
	BusTicket has 5% GST.

 Print ticket price including tax using overridden methods.

Explanation:
 Tests method overriding with percentage-based calculations.
*/

import java.util.*;
class Ticket{
	double price;

	double calculatePrice(double price){
		return price;
	}
	
}

class MovieTicket extends Ticket{
		
	double calculatePrice(double price){
		double TotalPrice=price*0.18;
		return TotalPrice+price;
	}
}

class BusTicket extends Ticket{
	
	double calculatePrice(double price){
		double TotalPrice=price*0.05;
		return TotalPrice+price;
	}	
}

public class TicketBill{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		MovieTicket Mt1=new MovieTicket();
		System.out.println("Enter the Movie Ticket Price :");
		double price=sc.nextDouble();
		
		System.out.println("Ticket Price :"+price);
		System.out.println("Total Price  :"+Mt1.calculatePrice(price));
		
		System.out.println("------------------------------------");
		
		BusTicket Bt1=new BusTicket();
		System.out.println("Enter the Bus Ticket Price :");
		price=sc.nextDouble();
		System.out.println("Ticket Price :"+price);
		System.out.println("Total Price  :"+Bt1.calculatePrice(price));
	}
}