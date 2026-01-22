
class ABC implements Runnable
{
	public void run(){
		try{
			for(int i=1; i<=10; i++){
			System.out.println("I="+i);
			Thread.sleep(1000);
			}
		}catch(Exception ex){
			System.out.println("Error is:"+ex);
		}
	}
} 

public class RunnableApp{
	public static void main(String x[]){
		Runnable rn=new ABC();
		Thread t=new Thread(rn);
		t.start();
	}
}