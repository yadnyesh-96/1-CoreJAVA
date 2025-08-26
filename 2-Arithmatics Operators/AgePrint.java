/*
Q53.Given age, print category:
Teen (13–19)
Adult (20–59)
Senior (60+)

*/
import java.util.*;
public class AgePrint{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	String str = ((num>=13)&&(num<=19))? "Teen" : ((num>=20)&&(num<=59))? "Adult" : "Senior";
	System.out.println(str);
	}

}