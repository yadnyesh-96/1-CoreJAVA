

// folder 

import java.util.*;
import java.io.*;
public class MkdirAPP{
	
	public static void main(String x[]){
		
		File f = new File("D:\\1-CoreJAVA\\18- File-Handling\\File-Handling-Practice");
		
		if(f.exists()){
			System.out.println("File Already Present");
		}else{
			boolean b = f.mkdir();
			if(b){
				System.out.println("File created Successfully...");
			}else{
				System.out.println("Error is Here");
			}
		}
	}
}