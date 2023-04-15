package JavaPractice;
import java.util.*;

public class SomeProblem {
    public static void main(String[] args) {
        mainFunction();
    }

    public static void mainFunction() {
        
        Scanner sc = new Scanner(System.in);

        
        int b = sc.nextInt();
        int a = sc.nextInt();

        if (a == b) {
            System.out.println("a is equal...");
        }


        else if (a > b) {
            System.out.println("a is greater than b...");
        }

        else if(a<b) {
            System.out.println("a is lesser...");
        }


    }
}
