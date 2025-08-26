// write a java program to convert seconds to hours, minutes and seconds
/*
- 3600 sec --> 1hr <--> 60min --> 3600 sec ;
input = 3662 sec. 

*/

public class TimeConversion{

	public static void main(String x[]){
	
	float sec=Integer.parseInt(x[0]);
	float min=sec/60; // minutes 
	float hrs=min/60; // Hours
	float s2=hrs/60; // Seconds
	
	
	
	System.out.println(hrs+"hr : "+min+"min : "+s2+"sec");
	//System.out.println(""+ min);
	//System.out.println(":"+s2);
	
	}
}
