class TestApp{
	
	public static void main(String x[]){
		int num=2;
		int pow=5;
		System.out.println(get(2,5));
	}
	
	public static int get(int n, int p){
		
		if(p==0){
			return 1;
		}else{
			return n*get(n,p-1);
		}
	}
}