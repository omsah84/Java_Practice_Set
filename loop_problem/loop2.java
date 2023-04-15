package loop_problem;
//write a program to calculate the sum of first 10 natural numebr...

public class loop2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            sum = i + sum;

        }
        
        System.out.println("The sum of first 10 natural number: "+sum);
    }
    
}
