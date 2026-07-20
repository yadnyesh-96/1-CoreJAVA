
import java.util.*;

class Test extends Thread{
	public void run(){
		try{
			for(int i=1; i<=10; i++){
				System.out.println("I ="+i);
				Thread.sleep(1000);
			}
			System.out.println("Exit");
			
		}catch(InterruptedException e){
			System.out.println("Error is "+e);
			
		}
	}
}

class Test1 extends Thread{
	
	public void run(){
			try{
				for(int i=1; i<=20; i++){
					System.out.println("J = "+j);
					Thread.sleep(1000);
				}
			}catch(InterruptedException e){
				System.out.println("Error is "+e);
			}
	}
}

public class ThreadAPP{
	public static void main(String x[]){
		Test t = new Test();
		t.start();
		
	}
}