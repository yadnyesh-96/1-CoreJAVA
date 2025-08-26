// Calculate the BMI from height and weight
// BMI = weight / (height*height)

public class Bmi{

	public static void main(String x[]){
	
	int wet=Integer.parseInt(x[0]);
	int hi= Integer.parseInt(x[1]);
	double bmi=wet/(hi*hi);
	System.out.println(bmi);
	}
}