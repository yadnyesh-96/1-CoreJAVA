// write a java program to enter marks of five subjects and calculate toatl marks and percentage. 
// The formula is: (Total Obtained Marks / Total Possible Marks) * 100



public class PerApp{

	public static void main(String x[]){
	
	int a1=Integer.parseInt(x[0]);
	int a2=Integer.parseInt(x[1]);
	int a3=Integer.parseInt(x[2]);
	int a4=Integer.parseInt(x[3]);
	int a5=Integer.parseInt(x[4]);
	
	int obt = a1+a2+a3+a4+a5;
	float total= (obt/500f)*100;
	System.out.println(total);
	
	}
}