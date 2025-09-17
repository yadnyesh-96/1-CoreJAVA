/*
6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/

class MaxFinder{
	
	int a,b,c;
	
	void Input(int num1, int num2, int num3){
	 a=num1;
	 b=num2;
	 c=num3;
	}
	
	void finMax(){
		
		
		
		if(a>b && a>c ){
			System.out.println(a);
		}else if(b>a && b>c ){
			System.out.println(b);
		}else if(c>a && c>b){
			System.out.println(c);
		}else{
		System.out.println("Both are Equal");
		}
	}
}

public class CheckMax{
	public static void main(String x[]){
		MaxFinder M=new MaxFinder();
		M.Input(10,200,30);
		M.finMax();
	}
}