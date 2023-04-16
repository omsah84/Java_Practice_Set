package function;

import java.util.Scanner;

//write a function to print the sum of all odd numbers form 1 to n..............

public class fun2 {
    public static void main(String[] args) {

        Scanner oj = new Scanner(System.in);
        System.out.println("Enter the number... ");
        int n = oj.nextInt();
        int sum = oddnum(n);
        System.out.println("The sum of odd number is: "+sum);

    }
    
    static int oddnum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {

            } else {
                sum = sum + i;
            }
        }
        
        return sum;
        
    }
}
