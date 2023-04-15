package loop_problem;

import java.util.Scanner;

//write a do while loop that asks the user to enter two numbers.the numbers should be added and the sum displayed. the loop shuld ask the user whether he or she wished to perform the operation again. if so the lopp should repeat.otherwise it should terminate.
public class loop10l {
    public static void main(String[] args) {
        Scanner oj = new Scanner(System.in);
        boolean i;

        do {
            System.out.println("Enter the first number..");
            int num1 = oj.nextInt();

            System.out.println("Enter the second number..");
            int num2 = oj.nextInt();

            int sum = num1 + num2;
            System.out.println("the addition :" + sum);

            System.out.println("do you want to again. if again than  write in small alpha 'yes' or 'no'");
            String st = oj.next();



            if (st.equals("yes")) {
                i = true;

            } else {

                i = false;
            }

            System.out.println("=====================================");

        } 
        while(i);
        
    }
}
