
public class StringOperation{
	public static void main(String x[]){
		
		String str="Java";
		int n=str.length()-1;
		int i=0;
		boolean flag=flase;
		while(i<=n){
			char s=str.charAt(i);
			char m=str.charAt(n);
			
			if(s!=m){
				flag=true;
				break;
			}
			i++;
			j--;
		}
		
		if(flag){
			System.out.println("Not pallindrome");
		}else{
			System.out.println("Pallindrome");
		}
		
	}
}