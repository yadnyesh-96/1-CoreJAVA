import java.util.*;

public class SelectionSortingAlgorithm
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the Values in Arrya:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Before the Sorting:" );
        System.out.println("[");
        for(int M:arr){
            System.out.printf("%d\t",M);
        }
        System.out.printf("]\n");


        // Selection Sorting algorithm can we apply here 
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        // print here the sorted array

        System.out.println("Arrya After the sorting :");
        System.out.println("[");
        for(int V:arr){
            System.out.printf("%d\t",V);
        }
        System.out.printf("]\n");

    }
    
}