

class VoterException extends RuntimeException{
	public String getErrorMsg(){
		return "YOur are not eligible for voting";
	}
}

class CheckVoter{
		
	public void voterCheck(int age){
		if(age<18){
			throw new VoterException();
		}else{
			System.out.println("Your eligible for voting");
		}
	}
}

public class ExceptionAPP{
	public static void main(String x[]){
		CheckVoter c = new CheckVoter();
		try{
			c.voterCheck(12);
		}catch(VoterException ex){
			System.out.println("Error is:"+ex.getErrorMsg());
		}
	}
}