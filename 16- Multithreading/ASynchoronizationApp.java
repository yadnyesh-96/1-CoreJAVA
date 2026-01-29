
class BankAccount{
	private int balance=100;
	
	public void TranscatioMethod(int amt){
		int temp=balance;
		System.out.println(Thread.currentThread().getName()+"Reads Balance: "+balance);
		temp=temp+amt;
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.println("Error: "+ex);
		}
		balance=temp;
		System.out.println(Thread.currentThread().getName()+":Write New Balance: "+balance);
		
	}

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
