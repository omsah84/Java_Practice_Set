package loop_problem;

import java.util.Scanner;

//write a program to find the factorial value of any number entered through the keyboard..
public class loop4 {
    public static void main(String[] args) {
        Scanner oj = new Scanner(System.in);
        System.out.println("Enter the factorial..");

        int num = oj.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = i * fact;
        }
        System.out.print(fact + " ");
    }
}
