/*

2. Question:

*/

class BankAccount{
		int time;
		double principalAmt;	
		
	double calculateInterest(){
		return 0;
	}
}

class saving extends BankAccount{
	
	double calculateInterest(){
		double interest =(principalAmt*time*5)/100;
		return interest;
	}
}

class CurrentAccount extends BankAccount{
	
	double calculateInterest(){
		double interest = (principalAmt*time*3)/100;
		return interest;	
	}
}

class Account {
	
	void InterceptorOperations(BankAccount b){
		double intres=b.calculateInterest();
		System.out.println("Interest :"+intres);
	}
}

public class InterestCalculate{
	public static void main(String x[]){
	
		/*
		saving s1=new saving();
		s1.time = 5;
		s1.principalAmt=10000;
		double intrest=s1.calculateInterest();
		System.out.println("Saving Account Interest Amount : "+intrest+" Rs.");
		
		CurrentAccount c1=new CurrentAccount();
		c1.time=10;
		c1.principalAmt=1000;
		intrest=c1.calculateInterest();
		System.out.println("Current Account Interest :"+intrest+" Rs.");
		*/
		
		Account A=new Account();
		
		BankAccount B=new saving();
		B.time=5;
		B.principalAmt=10000;
		
		
		A.InterceptorOperations(B);
		
		B=new CurrentAccount();
		B.time=10;
		B.principalAmt=1000;
		
		
		A.InterceptorOperations(B);
	}
}