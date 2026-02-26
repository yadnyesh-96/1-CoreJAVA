
class VoterException extends RuntimeException
{
	public String getErrorMessage(){
		return "you are not eligible for voting ";
	}
}

class CheckVoter{
	void validateVoter(int age){
		if(age<18){
			throw new VoterException();
		}else{
			System.out.println("you can vote");
		}
	}
}
public class ExceptionAPP{
	
	public static void main(String x[]){
		
		try{
			CheckVoter cv = new CheckVoter();
			cv.validateVoter(10);
			
		}catch(VoterException ex){
			System.out.println(ex.getErrorMessage());
		}
		
	}
}