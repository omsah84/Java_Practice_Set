package loop_problem;

import java.util.Scanner;

//write a program that prompts the user to input a positive integer. it should then output a message indicationg whether the numebr is a prime number.

public class loop8 {
    public static void main(String[] args) {
        Scanner oj = new Scanner(System.in);

        int n = oj.nextInt();

        int i, m, flag = 0;

        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("is not prime number..");
        }

        else {

            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("not pirme numebr..");
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
                System.out.println("is prime number");
            }
        }
        
    
        
    }
}
