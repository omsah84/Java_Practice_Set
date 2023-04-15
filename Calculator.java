
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            System.out.println("+,-,*,/,%");
            System.out.println("Choose any operation....");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            char choose = sc.next().charAt(0);

            calculatorFunction(choose);
            System.out.println();

            System.out.println("============================================================");

        }

    }

    static void calculatorFunction(char choose) {

        switch (choose) {

            case '+':
                sum();
                break;

            case '-':
                sub();
                break;

            case '*':
                mul();
                break;

            case '/':
                div();
                break;

            case '%':
                mod();
                break;

            default:
                System.out.println("Invalid choose....");
        }

    }

    protected static void sum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number..");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is :" + sum);
        return;

    }

    protected static void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number..");
        int num2 = sc.nextInt();

        int sub = num1 - num2;

        System.out.println("The sub of " + num1 + " and " + num2 + " is :" + sub);
        return;

    }

    protected static void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number..");
        int num2 = sc.nextInt();

        int mul = num1 * num2;

        System.out.println("The mul of " + num1 + " and " + num2 + " is :" + mul);
        return;

    }

    protected static void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number..");
        int num2 = sc.nextInt();

        int div = num1 / num2;

        System.out.println("The div of " + num1 + " and " + num2 + " is :" + div);
        return;

    }

    protected static void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number..");
        int num2 = sc.nextInt();

        int mod = num1 % num2;

        System.out.println("The mod of " + num1 + " and " + num2 + " is :" + mod);

        return;

    }
}