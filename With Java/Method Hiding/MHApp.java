/*
	Method Hiding
	When we override static method in child class called as method hiding.
	method hidign means we hide the parent method from child class for the overriding 
	called as method hiding 
 If we want to identify the method hiding and method overriding then we follow them :
 a.	if we create the reference of the parent class and object of the child class i.e, 
	upcasting then the if we called the overriden method then child class version fo method 
	get executed called as method overriding 
 b. 
*/

class Parent{
	
	static void show(){
		System.out.println("I am Parent method");
	}
}
class child extends Parent{
	static void show(){
		System.out.println("I am Child class Method");
	}
}
public class MHApp{
	public static void main(String x[]){
		Parent p1=new child();
		p1.show();
	}
}