/*
9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.
*/
import java.util.*;
class TemperatureConverter{
	//float F;
	double Convert(double a){
		double F=(a*1.8)+32.0;
		return F;
	}
}

public class convertToFahrenheit{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Temperature in Celsius:");
	double num=sc.nextDouble();
	
	TemperatureConverter t=new TemperatureConverter();
	
	double res=t.Convert(num);
	System.out.println(res);
	}
}