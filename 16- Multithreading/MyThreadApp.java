
class MyThread extends Thread{
	public void run(){
		try{
			for(int i=0; i<=20; i+=2){
				System.out.println("THread is: "+i+" "+isAlive());
				if(i==16){
					stop();
				}
				Thread.sleep(1000);
			}
		}catch(InterruptedException ex){
			System.out.println("Erros is :"+ex);
		}
	}
}

public class MyThreadApp{
	public static void main(String x[]){
		MyThread t1 = new MyThread();
		t1.start();
	}
}

