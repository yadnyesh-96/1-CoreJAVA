

/*
Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW).
 A company manager wants to make the production of both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels


*/

public class Vechicle{
	
	
	public static void main(String x[]){
		
		int TV = 200;
		int TW = 540;
		
		int a = TW-(2*TV);
		int f = a/2;
		
		int t = TV-f;
		
		System.out.println("TW = "+t+ " FW = "+f);
		
		
	}
	
	
	
}