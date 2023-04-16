package function;

import java.util.Scanner;

// write a funtion which takes in 2 numbers and returen the greater  of those two...

public class fun3 {
    public static void main(String[] args) {

        Scanner oj = new Scanner(System.in);

        System.out.println("Enter the first number...");
        int num1 = oj.nextInt();

        System.out.println("Enter the second number...");
        int num2 = oj.nextInt();

        int greater = greaterNumber(num1, num2);

        System.out.println("The greater number is : " + greater);

    }
    
    public static int greaterNumber(int num1, int num2) {
            
        if (num1 > num2) {
            return num1;
        }
        
        return num2;
            
        }
}
