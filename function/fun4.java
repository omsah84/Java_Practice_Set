package function;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

// write a function that takes in the raius as input and returns the circumference of a circle..

public class fun4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circumference of a circle: ");
        int radius = sc.nextInt();

        float circumferenceCircle = cifeCircle(radius);

        System.out.print("Enter the radius of circumference of a circle: " + circumferenceCircle);

    }
    
    static float cifeCircle(float radius) {
        float cir = 2 * 3.24f * radius;
        
        return cir;
    }
}
