
import java.util.*;
class UserException extends RuntimeException{
	public String getErrorMessage(){
		return "Your Account Balance is not sufficient";
	}
}

class Bank{
	double balance;
	double withdrawAmount;
	
	Bank(double balance, double withdrawAmount){
		this.balance = balance;
		this.withdrawAmount = withdrawAmount;
	}
	
	void withdrawBalance(double balance){
		if(balance>withdrawAmount){
			throw new UserException();
		}else{
			System.out.println("Amout Withdrawn Successfull...");
		}
	}
}

public class BankAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter balance:");
		double balance  = sc.nextDouble();
		System.out.println("Enter withdraw amount:");
		double amount = sc.nextDouble();
		
		try{
			Bank b = new Bank(balance,amount);
			b.withdrawBalance(balance);
			
		}catch(UserException e){
			System.out.println(e.getErrorMessage());
		}
	}
}