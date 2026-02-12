public class DisariumNumAPP{
	public static void main(String x[]){

		int n = 175;
		int temp=n;
		int count = 0;
		int fac=0;
		while(n!=0){

			int rem = n%10;
			++count;
				int i=count;
				int a=1;
				while(i!=0){
					a*=rem;
				}
				fac+=a;
			n = n/10;
		}

		System.out.println(fac);
	}
}