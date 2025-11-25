/* Upcasting :
 means when we convert the child class object into parent class object
 is called as the Upcasting technique.
 if we want to achive the upcasting we have to create the reference of the parent class
 and object of the child class.
 syntax: parentclassname ref=new childclassname();
*/

class Value{
	int a,b;
	
	void setValue(int a,int b){
		this.a=a;
		this.b=b;
	}
	int getResult(){
		return 0;
	}
}
class Add extends Value{
	
	int getResult(){
		return a+b;
	}
}
class Mul extends Value{
	int getResult(){
		return a*b;
	}
}
public class UPAPP{
	public static void main(String x[]){
		Value v1=null;
		v1=new Add();
		v1.setValue(10,20);
		int res=v1.getResult();
		System.out.println("Addition is:"+res);
		
		v1=new Mul();
		v1.setValue(2,5);
		res=v1.getResult();
		System.out.println("Multiplication is:"+res);
	}	
}