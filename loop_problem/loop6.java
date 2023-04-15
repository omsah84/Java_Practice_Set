package loop_problem;

import java.util.Scanner;

//write a program taht prompts the user to input an integer and then outputs the number with the digits reversed.
public class loop6 {
    public static void main(String[] args) {

        Scanner oj = new Scanner(System.in);
        int num = oj.nextInt();
        reverfun(num);

    }
    
    static void reverfun(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = rem + sum*10;
            num = num / 10;
        }     
        System.out.println(sum);

    }
}
