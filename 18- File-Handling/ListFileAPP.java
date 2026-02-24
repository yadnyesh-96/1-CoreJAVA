
import java.util.*;
import java.io.*;
public class ListFileAPP{
	
	public static void main(String x[]){
		
		File f1 = new File("D:\\1-CoreJAVA");
		File fileList[] = f1.listFiles();
		for(File f:fileList){
			System.out.println(f);
		}
	}
}