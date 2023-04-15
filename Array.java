import java.util.ArrayList;
import java.util.Scanner;

public class Array { 

    //driver code and calling form here to 1D array funtion
    public static void main(String[] args) {
        Array oj = new Array();

       oj.oneDarray();
    }
    
    //1D array funtion

    void oneDarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");

        int arr[] = new int[5];
        System.out.println("Enter the size..");
        int size = sc.nextInt();

        //make a array using colletions
        // ArrayList<Integer>arr = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array element...");

            //this for colletion function
            // arr.add(sc.nextInt());
        }

        
        //for eact loop to print a array element...
        System.out.print("[ ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("]");


        //output => [ 1,2,3,4,4 ]
    
    }
}
