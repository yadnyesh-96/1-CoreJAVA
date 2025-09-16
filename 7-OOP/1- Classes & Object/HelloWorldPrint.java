/* 1. Create a Class and Print a Message
Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
Explanation: Helps understand class and method creation.
*/

class HelloWorld{
	void PrintMsg(){
		System.out.println("Hello World !");
	}
}

public class HelloWorldPrint{
	public static void main(String x[]){
		HelloWorld show=new HelloWorld();
		show.PrintMsg();
	}

}