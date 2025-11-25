/*
Loose coupling can achive the by using runtime polymorphism mean if we want to achive the 
loos coupling we have to pass the references of the parent class in method so the benifit 
is method can work with any child class object of that particular parent as per the 
following example:
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
class Sub extends Value{
	int getResult(){
		return a-b;
	}
}
class Mul extends Value{
	int getResult(){
		return a*b;
	}
}
class Calculator{
	void getOperation(Value V,String type){
		int res=V.getResult();
		System.out.println(type +" is :"+res);
	}
}

public class LCAPP{
	public static void main(String x[]){
		
		Calculator c1=new Calculator();
		
		Value v=new Add();
		v.setValue(10,20); // 30
		c1.getOperation(v,"Addition");
		
		v=new Sub();
		v.setValue(30,10);//20
		c1.getOperation(v,"Substraction");
		
		v=new Mul();
		v.setValue(5,4); //20
		c1.getOperation(v,"Multiplication");
	}
}