
public class StringApp{
	
	public static void main(String x[]){
		
		String s="abc"; 	// stored in string constant pool
		String s1="abc";   // stored in string constant pool
		
		System.out.println("Hashcode of S:"+System.identityHashCode(s));
			
		System.out.println("Hashcode od s1:"+System.identityHashCode(s1));
		
		String s2=new String("abc");
		String s3=new String("abc");
		
		System.out.println("Hashcode of s2:"+System.identityHadhCode(s2));
		
		System.out.println("Hashcode of S3:"+System.identityHadhCode(s3));
		
	
	}
}