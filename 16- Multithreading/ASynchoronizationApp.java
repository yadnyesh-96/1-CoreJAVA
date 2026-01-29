
class BankAccount{
	private int balance=100;
	
	public void TranscatioMethod(int amt){
	
}

class Transactions extends Thread{
	BankAccount bank_acc;
	int amt;
	
	Transactions(BankAccount bank_acc,int amt){
		this.bank_acc=bank_acc;
		this.amt=amt;
	}
	
	public void run(){
		bank_acc.TranscatioMethod(amt);
	}
}

public class ASynchoronizationApp{
	public static void main(String x[])throws Exception
	{
		
		BankAccount b=new BankAccount();
		
		Transactions t1=new Transactions(b,50);
		t1.setName(" Deposite ");
		
		Transactions t2=new Transactions(b,-50);
		t2.setName(" Widraw ");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(" Account Balance is: "+b.getBalance());
	}
}
