
import java.util.*;
class UserException extends RuntimeException{
	
	public String getErrorMessage()
	{
		return "Your not eligible";
	}
}

class checkVoter{
	void validVoter(int age){
		
		if(age<18){
			throw new UserException();
		}else{
			System.out.println("You can Vote");
		}
	}
}
public class throwAPP{
	public static void main(String x[]){
		try{
			checkVoter c = new checkVoter();
			c.validVoter(10);
		}catch(UserException ex){
			System.out.println(ex.getErrorMessage());
		}
	}
}