//Q3. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
//		Formula :-  
//				fah = (cel * 9 / 5) + 32;
				
public class TemptoFarenheit{

	public static void main(String x[]){
	
	int cel = Integer.parseInt(x[0]);
	float a = (cel * 9 );
	float fah = (a / 5 ) + 32;
	
	System.out.println( fah);
	}
}				