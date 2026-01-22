import java.util.*;
class Table{
	
	synchronized public void show_Table(int no){
		
		try{
		
			for(int i=1; i<=no; i++){
				System.out.printf("%d X %d = %d\n",i,no,(no*i));
				if(i==5){
					wait(); // unconditional wait
				}	
				Thread.sleep(1000);
			}
		
		}catch(Exception ex){
			System.out.println("Error is: "+ex);
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
	Table t;
	Two(Table t){
		this.t=t;
	}
	
	public void run(){
		t.show_Table(2);
	}
}

class Three extends Thread{
	Table t1;
	Three(Table t1){
		this.t1=t1;
	}
	
	public void run(){
		t1.show_Table(3);
	}
}

public class InterCommApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Table t=new Table();
		
		Two t1=new Two(t);
		t1.start();
		
		Three t2=new Three(t);
		t2.start();
		
		do{
			String msg=sc.nextLine();
			if(msg.equals("restart"));
			{
				t.recall();
			}
		}while(true);
	}
}