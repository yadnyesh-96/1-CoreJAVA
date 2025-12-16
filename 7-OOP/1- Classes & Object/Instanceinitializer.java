//instance initilizer 

class Demo{
	static int a=10;
		//Instance initializer
		// instatnce initializer is a nameless block 
		// it is executes before the constructor 
		// uses the initialize the class memebers
	{
		System.out.println("Instance Initializer");
	}
	
	Demo(){
		System.out.println("Constructor ");
	}
}
public class Instanceinitializer{
	public static void main(String x[]){
		Demo i=new Demo();
		System.out.println(i.a);
		
	}
}

