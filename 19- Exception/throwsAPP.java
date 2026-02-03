
import java.util.*;
class div{
	void setValue(int val1,int val2)throws ClassNotFoundException,ArithmeticException
	{
		int res = val1/val2;
		System.out.println(res);
	}
}

public class throwsAPP{
	public static void main(String x[]){
		
		try{
			div d = new div();
			d.setValue(10,2);
		}catch(Exception ex){
			System.out.println("Error is:"+ex);
		}
	}
}