/*
6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.


Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.


Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/

class Order {
	int orderId;
	double amount;
	
	Order(int orderId,double amount){
		this.orderId=orderId;
		this.amount=amount;
	}
	
	void display(){
		System.out.printf("\n \n");
		System.out.println("~~~~~ Order Details ~~~~~");
		System.out.println("_________________________");
		System.out.println("Id :"+orderId);
		System.out.println("Amount :"+amount);
	}
}

class CODOrder extends Order{

	CODOrder(int orderId,double amount){
		super(orderId,amount);
	}
	
	void display(){
		super.display();

		System.out.println("Delivery Charge  :"+50+" Rs.");
		System.out.println("Total Bill Amount :"+(amount+50));
	}
}

class OnlinePaymentOrder extends Order{
	OnlinePaymentOrder(int orderId,double amount){
		super(orderId,amount);
	}
	
	void display(){
		super.display();
		double cashback=amount-amount*0.05;
		System.out.println("5% Cashback  :"+(amount*0.05)+" Rs.");
		System.out.println("Total Bill Amount :"+cashback);
	}
}

public class OnlineOrders{
	public static void main(String x[]){
	
		CODOrder o1=new CODOrder(01,1500);
		o1.display();
		
		OnlinePaymentOrder P1=new OnlinePaymentOrder(001,2000);
		P1.display();
		
	}
}