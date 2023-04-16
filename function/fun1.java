package function;

// enter 3 number froj the user and make a funtion to print their average..

public class fun1 {
    public static void main(String[] args) {

        int num1 = 32;
        int num2 = 32 ;
        int num3 = 32;

        int average = avg(num1,num2,num3);
        System.out.println("The average of three number is: "+average);
        
    }

    static int avg(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        
        int avg = sum/3;
        return avg;
    }
}
