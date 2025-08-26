// write a java program to enter length in centimeter and convert into meter and kilometer. 
// 1cm == 0.00001km;  1cm == 0.01m;

public class CmToKmTom{

	public static void main(String x[]){
	
	int cm=Integer.parseInt(x[0]);
	float km=cm*0.00001f;
	float m = cm* 0.01f;
	
	System.out.println(cm+" cm, "+km+" km, "+m+" m");
	}
} 