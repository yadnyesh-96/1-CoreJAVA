// convert min to hours and minutes 

public class MinToHour{

	public static void main(String x[]){
	
	int min = Integer.parseInt(x[0]);
	int hr = min/60; // Hours
	int min1 = min % 60;
	
	System.out.println(hr+" hr :"+min1+" min ;");
	
	}
}