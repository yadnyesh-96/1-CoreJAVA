// write a java program to swap two number without using third variable.

public class SwapTwo{

 public static void main(String x[]){
 
 int a=Integer.parseInt(x[0]);
 int b=Integer.parseInt(x[1]);
 
 a=b+a;
 b=a-b;
 a=a-b;
 System.out.println(a);
 System.out.println(b);
 }
}