package Basic_Program;

import java.util.Scanner;

//how to read and print an integer value in java


// java program to take an integer
//as input and print it.

class ReadAndPrint {

    public static void main(String[] args) {

        //declare the variable
        int varName;

        //input the integer
        System.out.println("Enter the intger: ");

        //create scanner object
        Scanner se = new Scanner(System.in);

        //read the next integer form the screen
        varName = se.nextInt();

        //display the integer.
        System.out.print("Entered integer is: "+varName);

    }
}