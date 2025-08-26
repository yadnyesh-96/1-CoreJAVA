/* Print a grade using ternary operators:
90+: A
80–89: B
70–79: C
<70: F
*/
import java.util.*;
public class GradeS{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name:");
	String str1 = sc.nextLine();
	System.out.println("Enter the Number:");
	int num = sc.nextInt();
	
	String str = (90<=num) ? "Grade:A": (num<89 || num>80)? "Garde:B" :(num<79 || num>70)? "Grade:C" : num<70 ? "Grade:F" : "Fail";
	System.out.println("----------------------------------------");
	System.out.println("Name:"+str1+"|");
	System.out.println("Your Score is "+num+" & your: "+str+"|");
	System.out.println("----------------------------------------");
	}
}