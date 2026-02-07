import java.util.*;

class BinarySearch{
     
        // Created the method to search the Value in Array
   public static int SearchValue(int[] a,int Skey){  // input parameter is that the inetegre arrya and serach key 
               // declare the mid as zero 

        while(L<=R){    // check continue the value 

            mid=L+(R-L)/2; // sets the mid value here 

            if(a[mid]==Skey){   // a[mid] == Skey then store mid in index and break the loop 
                index=mid;
                break;
            }
 
            if(a[mid]<Skey){        //if the a[mid] value is less than Skey then increment the L is means moves next index
                L=mid+1; 
            }else{  
                R=mid-1;            // else the decrement the R which means the revrse in index 
            }
        }

        return index;           // actual value of index is return we here .
    }

}


public class BSAPP{
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();   // input from user the Array size . 

        // declared here the array 
        int arr[]=new int[n];

        // input the array values from user 
        System.out.println("Enter the Value in Array:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        // To Binary Search Work with the sorted array 
        // thats why we need to the sort the array here \

		//Arrays.sort(arr);

        int i=0;
        while(i<(arr.length-1)){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

                // reset the index 0
                i=0;
            }
            else{
                i++; // either the incerement the i.
            }
        }

        // print the sorted array by using for each loop 
		System.out.printf("[");
        for(int V:arr){
            System.out.printf(" %d \t",V);
        }
		System.out.println("]\n");
	
        //input from user the Search key here 
        System.out.println("Enter the Serach Value:");
        int Skey=sc.nextInt();


        // Created the BinarySearch Class object
        BinarySearch b=new BinarySearch();

        int index=b.SearchValue(arr,Skey);

        if(index!=-1){
            System.out.println("Value "+Skey+" is Found at "+(index+1)+" -->"+arr[index]);
        }else{
            System.out.println("Value "+Skey+" is Not Found");
        }


    }
}