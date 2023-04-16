package function;

import java.util.Scanner;

//write a function that takes in age as input and returns if that person t vote or not . a person of age > 18 is eligible to vote.

public class fun5 {
    public static void main(String[] args) {

        Scanner oj = new Scanner(System.in);

        System.out.println("Enter your age..");
        int age = oj.nextInt();

        System.out.println(vote(age));
    }

    static String vote(int age) {
        String st;
        if (age > 18) {
            st= "You are eligible for vote....";
        }

        else {
            st= "Are you not eligible for vote...";
        }

        return st;
    }
}
