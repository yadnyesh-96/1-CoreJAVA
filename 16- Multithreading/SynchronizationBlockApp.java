
class BankAccount{
	private int balance=100;
	
	public void TranscationMethod(int amt){
		// Particular block synchronized
		synchronized(this){
		int temp=balance;
		System.out.println(Thread.currentThread().getName()+"Reads Balance: "+balance);
		temp=temp+amt;
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.println("Error :"+ex);
		}
		balance=temp;
		System.out.println(Thread.currentThread().getName()+":Write New Balance: "+balance);
		}		
	}
	
	public int getBalance(){
	 return balance;
	}
}
class Transaction extends Thread{
	BankAccount bank_acc;
	int val;
	
	Transaction(BankAccount bank_acc,int val){
		this.bank_acc=bank_acc;
		this.val=val;
	}
	
	public void run(){
		bank_acc.TranscationMethod(val);
	}
}

public class SynchronizationBlockApp{
	public static void main(String x[])throws Exception
	{
		BankAccount b=new BankAccount();
		Transaction t1=new Transaction(b,50);
		t1.setName("Deposite");
		
		Transaction t2=new Transaction(b,50);
		t2.setName("Widraw");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(" Account Balance is: "+b.getBalance());
	}
}