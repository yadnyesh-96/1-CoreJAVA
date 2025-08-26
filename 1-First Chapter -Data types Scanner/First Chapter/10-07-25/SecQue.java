// Write a java program to input all basic data types and print its output.
// Ex. Input: int a=2; char ch='A'; float f=3.14; double d=2.34647; long b=1234545;
//  output:  a=2; char ch='A'; float f=3.14; double d=2.34647; long b=1234545;



public class SecQue{

	public static void main(String x[]){
	
	int a =Integer.parseInt(x[0]);
	char ch =(x[1]).charAt(0);
	float f =Float.parseFloat(x[2]);
	double d =Double.parseDouble(x[3]);
	long b =Long.parseLong(x[4]);
	
	System.out.println("a="+a);
	System.out.println("ch="+ch);
	System.out.println("f="+f);
	System.out.println("d="+d);
	System.out.println("b="+b);
	
	}
}