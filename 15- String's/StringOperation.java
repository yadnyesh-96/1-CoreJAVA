
public class StringOperation{
	public static void main(String x[]){
		
		String str="madam";
		int n=str.length()-1;
		int i=0;
		boolean flag=false;
		while(i<=n){
			char s=str.charAt(i);
			char m=str.charAt(n);
			
			if(s!=m){
				flag=true;
				break;
			}
			i++;
			n--;
		}
		
		if(flag){
			System.out.println("Not pallindrome");
		}else{
			System.out.println("Pallindrome");
		}
		
	}
}