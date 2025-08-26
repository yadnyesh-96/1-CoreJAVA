/* Q2. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
		Formula :- 
				cel = (fah - 32) * 5 / 9;
				
*/
public class TemptoFaandCel{

	public static void main(String x[]){
	
	int cel = Integer.parseInt(x[0]);
	float con = (cel - 32) * 5 / 9f;
	
	System.out.println(con);
	
	
	}
}