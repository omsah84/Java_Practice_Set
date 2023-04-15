package loop_problem;

import java.util.Scanner;

//two numbers are enterd thorugh the keyboard. write a program ot find the value of one number to the power of another.
public class loop5 {
    public static void main(String[] args) {

        Scanner oj = new Scanner(System.in);


        System.out.println("Enter the number....");
        int num = oj.nextInt();
        System.out.println("Enter the power....");
        int pow = oj.nextInt();
        int mul = 1;

        for (int i = 1; i <= pow; i++) {

            mul = num * mul;
        }
        
        System.out.println("The power of "+ num+","+pow+" = " + mul);

        
    }
}
