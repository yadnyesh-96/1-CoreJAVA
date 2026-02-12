public class DisariumNumAPP{
	public static void main(String x[]){

		int num = 175;
		int temp=num;
		int count = 0;
		int pow=0;
		
		int rev=0;
		while(num!=0){
			int rem = num%10;
			rev=rev*10+rem; 
			num = num / 10;
		}
		
		
		
		int n= rev;
		
		
		while(n!=0){

			int rem = n%10;
			++count;
				int i=count;
				int p=1;
				while(i!=0){
					p*=rem;
					i--;
				}
				pow+=p;
				
			n = n/10;
		}

		System.out.println(pow==temp?"Diserium" : "Not Diserium");
	}
}