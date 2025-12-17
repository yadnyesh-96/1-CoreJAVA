public class MainMethodOverloaded{
	
	public static void main(String... x){
		
		main(10);
		main("Yadnyesh");
	}
	
	public static void main(int a){
		System.out.println("Variable :"+a);
	}
	
	public static void main(String b){
		System.out.println("User entered name:"+b);
	}
	
}