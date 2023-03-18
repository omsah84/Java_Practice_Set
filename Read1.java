import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read1 {
    public static void main(String... are) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name);

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();


    }

}
