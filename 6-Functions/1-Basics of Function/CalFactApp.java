//WAP to create a function name as void factorial(int no) this function accepts a 
// number from the keyboard and calculates its factorial

import java.util.*;
public class CalFactApp{
	public static void main(String x[]){
		int no = 5;
		int res = fac(no);
		
	}
	
	public static int fac(int no){
		int fac=0;
		for(int i=1; i<=no; i++){
			fac*=i;
		}
		return fac;
	}
}