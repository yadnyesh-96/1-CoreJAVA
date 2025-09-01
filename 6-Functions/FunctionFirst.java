//calclulate the power by using take the input base and index

import java.util.*;
public class FunctionFirst{
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and index:");
        int bs=sc.nextInt();
        int ind=sc.nextInt();

        int res=getPow(bs, ind);
        System.out.println("Calculated power is:"+res);

    }

    public static int getPow(int base, int index){
        int pow=(int)Math.pow(base,index);
        return pow;
    }

}