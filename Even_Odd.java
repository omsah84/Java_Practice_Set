package JavaPractice;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        mainFunction();

    }

    private static void mainFunction() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even...");
        }
        else {
            System.out.println("Odd...");
        }
        
    }

}
