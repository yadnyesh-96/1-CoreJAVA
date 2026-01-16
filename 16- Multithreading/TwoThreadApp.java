

class Test extends Thread{
	
	public void run(){
		
		try{
			
			for(int i=1; i<=5; i++){
				System.out.printf("I =%d\n",i);
					
				Thread.sleep(1000);
			}
		}catch(InterruptedException ex){
			System.out.println("Error is:"+ex);
		}
	}
}

class Test1 extends Thread{
	
	public void run(){
		try{
			for(int j=1; j<=5; j++){
				System.out.printf("J =%d\n",j);
			}
			
		}catch(InterruptedException ex1){
			System.out.println("Error is:"+ex1);
		}
	}
}

public class TwoThreadApp{
	public static void main(String x[]){
		
		Test t1=new Test();
		t1.start();
		
		Test1 t2=new Test1();
		t2.start();
	}	
}