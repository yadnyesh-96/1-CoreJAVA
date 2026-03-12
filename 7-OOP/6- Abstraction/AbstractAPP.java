

abstract class A{
	abstract void show();
}

public class AbstractAPP{
	public static void main(String x[]){
		
		A a1= new A(){
			void show(){
				System.out.println("Show Mehtod");
			}
		};
		a1.show();
	}
}