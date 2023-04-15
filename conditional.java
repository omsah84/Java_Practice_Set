package JavaPractice;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        mainFunction();
    }

    private static void mainFunction() {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Your are adult...");

        }
        else {
            System.out.println("You are not adult...");
        }
    }
}
