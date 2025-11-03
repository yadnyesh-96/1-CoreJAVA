/*
Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000
A parameterized constructor to initialize all fields
A method deposit() to add money
A method display() to show details.
Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
*/

class BankAccount{
	
	private int accNo;
	private String accHolder;
	private double balance;
	
	
	//Default Constructor without parameterized
	BankAccount(){
		this.balance=1000;
	}
	
	
	// prameterized constructor	
	BankAccount(int accNo, String accHolder, double balance){
		this.accNo=accNo;
		this.accHolder=accHolder;
		this.balance=balance;
	}
	
	void setAccNo(int accNo){ this.accNo=accNo; }
	
	void setAccHolder(String accHolder) {this.accHolder=accHolder; }
	
	void setAccBalance(double balance){ this.balance=balance; }
	
	// A method deposit() to add money
	void deposite( double amount){
		balance+=amount; // add the new balance set by user input;
	}
	
	// A method display() to show details.
	void display(){
		System.out.println("Bank Account Statement");
		System.out.println("------------------------------");
		System.out.println("Bank Account No :"+accNo);
		System.out.println("Account Holder  :"+accHolder);
		System.out.println("Balance 		:"+balance);
		System.out.println("------------------------------");
	}
	
}

public class BankAcc{
	
	public static void main(String x[]){
		
		// Create object first to allocate the value 
		BankAccount b1=new BankAccount();
		b1.deposite(500);
		b1.display();
		
		// create object ot call and initialize parameterized constructor
		BankAccount b2=new BankAccount(001,"ABC",10000);
		b2.deposite(5000);
		b2.display();
	}
}