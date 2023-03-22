package Pattern;
public class Left_Triangle_pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            
            System.out.println();
        }
    }
}
