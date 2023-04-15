package JavaPractice;
import java.util.*;

public class Variable {
    public static void main(String[] args) throws Exception{
        variablePrint();
    }

    static void variablePrint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a..");
        int a = sc.nextInt();
        System.out.println("input b..");
        int b = sc.nextInt();
        
        
        System.out.println("input name..");
        String name = sc.next();
        System.out.println("input fullName..");
        sc.nextLine();
        String fullName = sc.nextLine();
        // sc.close();

        System.out.println();
        System.out.print(a+"\n"+name+"\n"+fullName);
        // System.out.println(name);
        // System.out.println(fullName);

        System.out.println("floating ...");
        float f1 = sc.nextFloat();
        
        System.out.println("double......");
        double d1 = sc.nextDouble();

        System.out.println("byte......");
        byte b1 = sc.nextByte();

        System.out.println("long..");
        long l1 = sc.nextLong();

        System.out.println("boolean...");
        boolean b2 = sc.nextBoolean();

        System.out.println(b2);

        System.out.println("short...");
        short s1 = sc.nextShort();

        System.out.println();
        System.out.print(f1 + "floating..");
        System.out.println(s1 + "doubling...");
        System.out.println(b1 + "byte..");
        System.out.println(l1 + "long...");
        System.out.println(b2 + "boolean...");
        System.out.println(s1+"short...");

    }
}

