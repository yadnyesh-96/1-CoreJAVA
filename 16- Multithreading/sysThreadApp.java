

class Print{
		
	public void PrintA(){
		try{
			for(int i=1; i<=5; i++){
				System.out.printf("A =%d\n",i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ex){
			System.out.println("Error is:"+ex);
		}
	}
	
	public void PrintB(){
		try{
			for(int j=1; j<=6; j++){
				System.out.printf("B =%d\n",j);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ex){
			System.out.println("Error is:"+ex);
		}
	}
}
class Test extends Thread{
	
	Print p;
	Test(Print p){
		this.p=p;
	}
	
	public void run(){
		p.PrintA();
	}
}

class Test1 extends Thread{
	
	Print p;
	Test1(Print p){
		this.p=p;
	}
	
	public void run(){
		p.PrintB();
	}
}

public class sysThreadApp{
	
	public static void main(String x[]){
		
		Print p=new Print();
		
		Test t1=new Test(p);
		t1.start();

		Test1 t2=new Test1(p);
		t2.start();
	}
}