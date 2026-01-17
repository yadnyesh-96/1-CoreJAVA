
class Test extends Thread{
	public void run(){
		try{
			
			for(int i=1; i<=5; i++){
					System.out.printf("A = %d\n",i);
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
				
			for(int j=1; j<=6; j++){
				System.out.printf("B = %d\n",j);
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException ex){
			System.out.println("Error is:"+ex);
		}
	}
}

public class JoinThreadApp{
	public static void main(String x[]){
		Test t1=new Test();
		t1.start();
		t1.join();
		Test1 t2=new Test1();
		t2.start();
	}
}