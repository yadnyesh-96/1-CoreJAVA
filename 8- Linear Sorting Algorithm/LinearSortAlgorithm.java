import java.util.*;
class Algorithm{

    // We declraed the Function/Method to Find the Value in the array present or not 
    // if value present the we return there index and if not be the present we retunr as index value sets which is--> -1
    int LinearSort(int[] m,int seky){

        int index=-1; // sets the by default value to the index -1 if not found we return this
        
        // here we start the loop for the comparing and search the value present in the array 
        for(int i=0; i<m.length; i++){
            if(m[i]==seky){ // by using the conditional statement .
                index=i;  // if value are the found then the it stores in the index and
                break; // break if found 
            }
        } 
        return index; // here we return the index value 
    }
}
public class LinearSortAlgorithm{

    //main method
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);   // imported the scanner class here

        int a[]=new int[5]; // new array created with the sixe of 5 there will be static we also change as per the requirement 

        //Lets Insert the values in array 
        System.out.println("Enter the Values in Array: ");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        //Lest the Print the Array 
        System.out.printf("[");
        for(int V:a){      /// by using the for each loop
            System.out.print(V+" ");
        }
        System.out.printf("]");

        System.out.println(); // new Line

        // Take the Search Value from user here
        System.out.println("Enter the Value to seach ");
        int s=sc.nextInt();

        //created the Algorith class Object here
        Algorithm a1=new Algorithm();

        //call the LineSort() method which is in the Algorithm class by call them using the a1 named object 
        // pass in that parameter as the first array and second is search value 
        int index=a1.LinearSort(a,s);

        if(index!=-1){  // if the method return the index nor the -1 then if condition executes 
            System.out.println("Value "+s+" is Founded at "+(index+1)+" ---> "+a[index]);  
        }else{
            System.out.println("Value "+s+" has not found !");
        }


    }
    
}