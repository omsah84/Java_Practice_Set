//java program to swap two numbers.

public class swaping3 {

    static void swapTwoNumber(int a, int b) {
        int tem = a;
        a = b;
        b = tem;

        System.out.println("After swaping two numbe is a ="+a+" and b ="+b);

    //another swaping method
    // static void swapTwoNumber(int a, int b) {
    //     a = a ^ b;
    //     b = a ^ b;
    //     a = a ^ b;

    //     System.out.println("After swaping two numbe is a ="+a+" and b ="+b);
    // }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swaping a = 10 and b = 20");

        swapTwoNumber(a, b);
    }

}
