

public class Runnable_anonymous{
	public static void main(String x[]){
		
		Runnable rn=new Runnable(){
			public void run(){
				try{
					for(int i=1; i<=5; i++){
					System.out.println("A= "+i);
					Thread.sleep(1000);
					}
				}catch(Exception ex){
					System.out.println("Error is: "+ex);
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
	}
}