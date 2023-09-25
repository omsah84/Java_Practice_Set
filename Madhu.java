import java.util.Scanner;

class Madhu {
    public static void main(String[] args) {
        String name;
        String newName = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                int a = c;
                int newnum = a + 2;
                char newchar = (char) newnum;

                newName = newName + newchar;

            } else {

                newName = newName + c;
            }

        }

        System.out.println(newName);
    }
}