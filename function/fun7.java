package function;

import java.util.Scanner;

//write a program to enter the numbers till the user wants and at shuld display the count of positive, negative and zerots entered.

public class fun7 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter number..");
            int count = 0;
            int count1 = 0;
            int count3 = 0;

            Scanner oj = new Scanner(System.in);
            int num = oj.nextInt();
            int sum = display(num, count, count1, count3);
            System.out.println(sum);

        }
    }
    
    static int display(int num, int count,int count1,int count3){

        if(num==0)
        {
            // System.out.println(coun);
            count++;
        }
        else if(num>0){
           return count1++;
        }
        else{
            return count3++;
        }

        return 0;

    }
}