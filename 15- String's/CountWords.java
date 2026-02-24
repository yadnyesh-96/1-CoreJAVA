
/*
Q7: Count Words in a String
Input: "Java is very easy"
Output: 4
*/

public class CountWords{
	
	public static void main(String x[]){
		
		String str = "Java is very easy";
		
		/*
		String words[] = str.trim().split("\\s+");
		System.out.println("Words Count = "+words.length);
		*/
		
		int count=0;
		boolean flag=false;
		
		for(char ch : str.toCharArray()){
			if(ch!=' ' && !flag){
				count++;
				flag=true;
			}else if(ch==' '){
				flag=false;
			}
		}
		
		System.out.println("Words Count ="+count);
		
	}
}