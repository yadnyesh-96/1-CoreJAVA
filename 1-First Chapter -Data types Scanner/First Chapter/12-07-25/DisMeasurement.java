// Convert inches to Centimeter 
// 1 cm = 0.393701 / 2.54cm

public class DisMeasurement{

	public static void main(String x[]){
	
	int in=Integer.parseInt(x[0]);
	float cm=in*0.393701f;
	System.out.println("inches in centimeter:"+cm);
	}
}
