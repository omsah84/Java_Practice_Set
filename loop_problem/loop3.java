package loop_problem;

import java.util.Scanner;

//write a program that prompts the user to input a positive integer. it should then print the multiplication table of that numebr.
public class loop3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            
            int mul = num * i;
            System.out.println(mul);
        }
        
    }
}
