package Pattern;
public class UpperStarTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a <= i; a++) {
                System.out.print("*");

            }
            
            System.out.println();

        }
    }
}
