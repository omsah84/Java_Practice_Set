package function;

import java.util.Scanner;

//two numbers are entered by the user,x and n. write a funtion to find the value of one number raised to the power of another.

public class fun8 {
    public static void main(String[] args) {

        Scanner oj = new Scanner(System.in);

        System.out.println("Enter the number..");
        int num = oj.nextInt();

        System.out.println("Enter the power number..");
        int pow = oj.nextInt();

        power(num, pow);

    }
    
    static void power(int num, int pow)
    {
        int sum = 1;

        for (int i = 0; i < pow; i++) {

            sum = num * sum;
        }
        
        System.out.println("the power of give number.:"+sum);
    }
}
