import java.util.Scanner;

public class rect {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int n = sc.nextInt();
        patterPrint();
    }
    static void patterPrint() {
        //outer loop for row...
        for (int r = 1; r <= 5; r++) {
            for(int c = 5; c>=1; c--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}