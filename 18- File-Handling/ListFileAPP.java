
import java.util.*;
import java.io.*;
public class ListFileAPP{
	
	public static void main(String x[])throws IOException
	{
		
		File f1 = new File("D:\\1-CoreJAVA");
		/*
		File fileList[] = f1.listFiles();
		for(File f:fileList){
			System.out.println(f);
		}
		*/
		File f2 = new File("D:\\1-CoreJAVA\\18- File-Handling\\File-Handling-Practice\\FileHandling.txt");
		
		boolean b = f2.createNewFile();
		if(b){
			System.out.println("File Successfully Created..");
		}else{
			System.out.println("File not Created");
		}
	}
}


import java.util.Scanner;

public class Q1_ArmstrongRecursion {

    // Count digits recursively
    static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    // Recursive power without Math.pow()
    static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }

    // Recursive Armstrong sum
    static int armstrongSum(int n, int digits) {
        if (n == 0)
            return 0;
        int rem = n % 10;
        return power(rem, digits) + armstrongSum(n / 10, digits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int digits = countDigits(num);
        int sum = armstrongSum(num, digits);

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}



public class Q2_Pattern {
    public static void main(String[] args) {

        int n = 4;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Forward characters
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            // Reverse characters
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }

            System.out.println();
        }
        
    }
}