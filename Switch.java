package JavaPractice;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Switch {
    public static void main(String[] args) {
        mainFunction();

    }
    
    public static void mainFunction() {
        Scanner sc = new Scanner(System.in);

        int var = sc.nextInt();

        switch (var) {
            case 1:
                System.out.println("hello...");
                break;

            case 2:
                System.out.println("welcome..");
                break;
            
            case 3:
                System.out.println("bonjour...");
                break;

            default: System.out.println("Invalid numebr....");
        }
    }
}
