
import java.util.*;

class Table{
	static Thread th;
	static int num;
	
	synchronized void show_Table(int no,Thread t){
	num=no;
		try{
		for(int i=1; i<=5; i++){
			System.out.println("%d X %d = %d\n",n,i,i*n);
			if(i==5){
				th=t;
				wait();
				System.out.println("Thread "+no+" state "+t.getState());
			}
			Thread.sleep(1000);
		}		
		}catch(Exception ex){
			System.out.println("Error is:"+ex);
		}
	}
	
	synchronized void recall(){
		try{
			notifyAll();
		}catch(Exception ex){
			System.out.println("Error is :"+ex);
		}
	}
}

class Two extends Thread{
	Table table;
	int n;
	
	Two(Table table,int n){
		this.table=table;
		this.n=n;
	}
	
	public void run(){
		System.out.println("Now status of 2 Thread "+this.getState());
		table.show_Table(n,this);
	}
}

class Three extends Thread{
	Table table3;
	int n1;
	
	Three(Table table3,int n1){
		this.table3=table3;
		this.n1=n1;
	}
	
	public void run(){
		table3.show_Table(n1,this);
	}
}

public class ThreadLifeCycleAPP{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		Table t=new Table();
		
		Two t1=new Two(t,2);
		System.out.println("Now state of Two thread  "+t1.getState());
		t1.start();
		
		Three t2=new Three(t,3);
		t2.start();
		
		do{
			String msg=sc.nextLine();
			System.out.println(Table.num+" state "+Table.getState());
			if(msg.equals("restart")){
				t.recall();
			}
			
			if(msg.equals("stop")){
			break;
			}
		}while(true);
		

	}
}