/* With help of dynamic polymorphism we can achive the coupling in application 
1.What is the coupling?
Coupling means the one is the dependent on the another object is called as coupling
if we think about the coupling we have two types of classes.
	a.Target class.
	b.Dependent class.

There are 2-types of coupling:
 1.Tight coupling
 2.Loose coupling 
 
1.Tight coupling :
	When the target class methods totally 100% depends on dependent class object
	or reference called as tight coupling. 
2.Loose coupling :
	The Loose coupling Target class methods partially depends on the dependent class object
	or reference called as Loose coupling.
*/

class Value{
	int a,b;
	
	void setValue(int a, int b){
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

class calculator{
	
	void operation(Add ad){
		int res=ad.getResult();
			System.out.println("Addition is:"+res);
	}
	
	void operation(Mul m){
		int mul=m.getResult();
		System.out.println("Multiplication is:"+mul);
	}
}

public class CApp{
	public static void main(String x[]){
			calculator c1=new calculator();
			Add a=new Add();
			a.setValue(10,20);
			c1.operation(a);
			
			Mul m=new Mul();
			m.setValue(5,2);
			c1.operation(m);
	}
}