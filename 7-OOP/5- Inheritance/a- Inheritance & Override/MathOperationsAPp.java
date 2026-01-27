

class Value{
	int a,b;
	public void setValue(int a, int b){
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
	
	public void performOperation(Add ad){
		int result = ad.getResult();
		System.out.println("Addition is: "+result);
	}
	
	public void performOperation(Mul ml){
		int result = ml.getResult();
		System.out.println("Multiplication is: "+result);
	}
}

public class MathOperationsAPp{
	public static void main(String x[]){
		
		Calculator c=new Calculator();
		Add a=new Add();
		a.setValue(5,10);
		c.performOperation(a);
		
		Mul m=new Mul();
		m.setValue(5,2);
		c.performOperation(m);
	}
}