package loop_problem;

import java.util.Scanner;

//write a program that reads a set of integers, and then prints the sum of the even and odd integer..

public class loop7 {
    public static void main(String[] args) {
        while (true) {
            
            
            Scanner oj = new Scanner(System.in);
            //set of integer..
            System.out.println("Enter set of integer..");
            int num = oj.nextInt();

        //assignning evensum = 0
        //assignning oddsum = 0

        int even_sum = 0;
        int odd_sum = 0;

        while (num > 0) {

            //takeing last digit
            int rem = num % 10;
            
            //check even number 
            if (rem % 2 == 0) {
                
                //adding even digit
                even_sum = even_sum + rem;

                //removing last digit
                num = num / 10;

            }
            
            //odd number
            else {
                
                //adding odd digits
                odd_sum = odd_sum + rem;
                num = num / 10;
            }
        }
        
        //printing even and odd summ...
        
        System.out.println("The sum of even:" + even_sum);
        System.out.println("The sum of odd: " + odd_sum);
        System.out.println("===============================================");
        
    }

        
    }
}
