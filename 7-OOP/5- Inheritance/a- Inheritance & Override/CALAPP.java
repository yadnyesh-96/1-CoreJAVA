
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

public class CALAPP{
	public static void main(String x[]){
		
		Value v=null;
		v=new Add();
		v.setValue(10,20);
		int result = v.getResult();
		System.out.println("Addition is: "+result);
		
		v=new Mul();
		v.setValue(5,4);
		result = v.getResult();
		System.out.println("Multiplication is: "+result);
	}
}