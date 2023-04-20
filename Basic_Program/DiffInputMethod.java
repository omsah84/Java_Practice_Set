package Basic_Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

//ways to read input form console in java


public class DiffInputMethod {

    //first method
    static class BuffReaderClass {
        public static String name;

        BuffReaderClass() throws IOException {
            //using bufferedReader class

            //entered data using bufferedReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //reading data using readline
            
            System.out.println("Enter data..");
            this.name = reader.readLine();
            
            //printing the read line
            System.out.println(name);
            
        }
        
    }
    
    //method 2
    
    static class ScnnerMethod {
        ScnnerMethod() {
            //using scanner for getting input form user
            Scanner in = new Scanner(System.in);
            
            System.out.println("Enter data..");
            //reading string data from user
            String s = in.nextLine();
            
            //printing string data 
            System.out.println("You entered string " + s);
            
            System.out.println("Enter data..");
            //reading integer data from user using nextInt method
            int a = in.nextInt();
            
            //printing integer data 
            System.out.println("you entered integer " + a);
            
            //reading floating data from user using predefine method nextFloat
            System.out.println("Enter data..");
            float b = in.nextFloat();
            
            //displaying float data
            System.out.println("Enter data..");
            System.out.println("you entered float " + b);
            
        }
    }
    
    //method 3
    
    static class Consolemethod{
        Consolemethod() {
            //using console to input data form user
            System.out.printf("enter the console data..");
            String name = System.console().readLine();
            System.out.printf("yor entered string %s",name);
        }
    }
    
    //drive code..
    public static void main(String[] args) throws Exception{
        BuffReaderClass oj = new BuffReaderClass();
        // DiffInputMethod ok = new DiffInputMethod();
        ScnnerMethod ob = new ScnnerMethod();
        Consolemethod c0 = new Consolemethod();

    }
}
