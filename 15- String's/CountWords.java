
/*
Q7: Count Words in a String
Input: "Java is very easy"
Output: 4
*/

public class CountWords{
	
	public static void main(String x[]){
		
		String str = "Java is very easy";
		String words[] = str.trim().split("\\s+");
		System.out.println("Words Count = "+words.length);
	}
}