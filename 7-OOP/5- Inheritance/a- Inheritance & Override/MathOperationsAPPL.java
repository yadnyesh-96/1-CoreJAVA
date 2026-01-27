
class Value{
	int a,b;
	
	public void setValue(int a,int b){
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
class Calculator{
	
	public void performOperation(Value v,String op){
		int result = v.getResult();
		System.out.println(op+" "+result);
	}
}

public class MathOperationsAPPL{
	public static void main(String x[]){
		
		Calculator c = new Calculator();
		Value v=null;
		v=new Add();
		v.setValue(4,6);
		c.performOperation(v,"Addition");
		
		v=new Mul();
		v.setValue(3,10);
		c.performOperation(v,"Multiplication");
		
	}
}