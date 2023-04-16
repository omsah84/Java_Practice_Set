package function;

import java.util.Scanner;


//write a program to print fibonacci series of n terms where n is input by user:

public class fun9 {
    public static void main(String[] args) {

        Scanner oj = new Scanner(System.in);
        int num = oj.nextInt();
        System.out.print("0 ");
        System.out.print("1 ");

        fib(num);

    }
    
    static void fib(int num) {
        int pre = 0;
        int next = 1;
        int cur;

        for (int i = 3; i <= num; i++) {

            cur = pre + next;
            System.out.print(cur+" ");
            pre = next;
            next = cur;   
            
        }
        

    }
}
